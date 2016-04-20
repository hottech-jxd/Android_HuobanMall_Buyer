package com.huotu.partnermall.ui.login;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.view.View;
import android.widget.RelativeLayout;
import com.huotu.partnermall.config.Constants;
import com.huotu.partnermall.inner.R;
import com.huotu.partnermall.model.AccountModel;
import com.huotu.partnermall.ui.base.BaseActivity;
import com.huotu.partnermall.utils.AuthParamUtils;
import com.huotu.partnermall.utils.HttpUtil;
import com.huotu.partnermall.utils.SystemTools;
import com.huotu.partnermall.widgets.MsgPopWindow;
import com.huotu.partnermall.widgets.NoticePopWindow;
import com.huotu.partnermall.widgets.ProgressPopupWindow;
import java.util.Map;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.wechat.friends.Wechat;

/**
 * 登录界面
 */
public class LoginActivity extends BaseActivity implements Handler.Callback {
    @Bind(R.id.loginL)
    RelativeLayout loginL;
    AutnLogin login;
    Handler mHandler;
    ProgressPopupWindow progress;
    ProgressPopupWindow successProgress;
    NoticePopWindow noticePop;
    MsgPopWindow msgPopWindow;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        mHandler = new Handler ( this );
        setContentView(R.layout.login_ui);
        ButterKnife.bind(this);
        initView();
        progress = new ProgressPopupWindow ( LoginActivity.this );
        successProgress = new ProgressPopupWindow (  LoginActivity.this );
    }

    @Override
    protected void initView ( ) {
        Drawable[] drawables = new Drawable[2];
        drawables[0] = new PaintDrawable( ContextCompat.getColor( this , R.color.theme_color));  //res.getColor(R.color.theme_color));
        drawables[1] = new PaintDrawable( SystemTools.obtainColor( getString(R.string.maincolor) ) );//new PaintDrawable(SystemTools.obtainColor( application.obtainMainColor()));
        LayerDrawable ld = new LayerDrawable(drawables);
        ld.setLayerInset(0, 0, 0, 0, 0);
        ld.setLayerInset(1, 0, 2, 0, 0);
        SystemTools.loadBackground(loginL, ld);
    }

    @Override
    protected void onDestroy ( ) {
        super.onDestroy ( );
        ButterKnife.unbind(this);
        if( progress!=null ){
            progress.dismissView();
            progress=null;
        }
        if( successProgress !=null) {
            successProgress.dismissView();
            successProgress=null;
        }

        if(mHandler!=null){
            mHandler.removeCallbacksAndMessages(null);
        }
    }

    @Override
    protected void onResume ( ) {
        super.onResume();

        if(null != progress){
            progress.dismissView ( );
        }

        loginL.setClickable(true);
    }

    @OnClick(R.id.loginL)
    void doLogin(){
        progress.showProgress(null);
        progress.showAtLocation ( loginL, Gravity.CENTER, 0, 0 );
        //微信授权登录
        login = new AutnLogin ( mHandler );
        login.authorize(ShareSDK.getPlatform( Wechat.NAME ));
        loginL.setClickable(false);
    }
    
    @Override
    public boolean handleMessage ( Message msg ) {
        loginL.setClickable(true);
        switch ( msg.what )
        {
            //授权登录
            case Constants.MSG_AUTH_COMPLETE:
            {
                //提示授权成功
                Platform plat = ( Platform ) msg.obj;
                login.authorize ( plat );
            }
            break;
            //授权登录 失败
            case Constants.LOGIN_AUTH_ERROR:
            {
                progress.dismissView ( );
                successProgress.dismissView ();
                //提示授权失败
                String notice = ( String ) msg.obj;
                noticePop = new NoticePopWindow ( LoginActivity.this,  notice);
                noticePop.showNotice ();
                noticePop.showAtLocation ( loginL , Gravity.CENTER, 0, 0 );
            }
            break;
            case Constants.MSG_AUTH_ERROR:
            {
                progress.dismissView ( );
                Throwable throwable = ( Throwable ) msg.obj;
                if( throwable instanceof cn.sharesdk.wechat.utils.WechatClientNotExistException ){
                    //手机没有安装微信客户端
                    phoneLogin("您的设备没有安装微信客户端,是否通过手机登录?");
                }else {
                    progress.dismissView ();
                    //提示授权失败
                    noticePop = new NoticePopWindow ( LoginActivity.this, "微信授权失败");
                    noticePop.showNotice ();
                    noticePop.showAtLocation ( loginL, Gravity.CENTER, 0, 0 );
                }
            }
            break;
            case Constants.MSG_AUTH_CANCEL:
            {
                phoneLogin("你已经取消微信授权,是否通过手机登录?");
            }
            break;
            case Constants.MSG_USERID_FOUND:
            {
                successProgress.showProgress ( "已经获取用户信息" );
                successProgress.showAtLocation ( loginL , Gravity.CENTER, 0, 0);
            }
            break;
            case Constants.MSG_LOGIN:
            {
                progress.dismissView ( );
                //登录后更新界面
                AccountModel account = ( AccountModel ) msg.obj;
                //和商家授权
                AuthParamUtils paramUtils = new AuthParamUtils ( application, System.currentTimeMillis (), "", LoginActivity.this );
                final Map param = paramUtils.obtainParams ( account );
                String authUrl = Constants.getINTERFACE_PREFIX() + "weixin/LoginAuthorize";
                HttpUtil.getInstance ().doVolley ( LoginActivity.this, mHandler, application, authUrl, param, account );
            }
            break;
            case Constants.MSG_USERID_NO_FOUND:
            {
                progress.dismissView ();
                //提示授权成功
                noticePop = new NoticePopWindow (  LoginActivity.this, "获取用户信息失败");
                noticePop.showNotice ();
                noticePop.showAtLocation (loginL , Gravity.CENTER, 0, 0);
            }
            break;
            case Constants.INIT_MENU_ERROR:
            {
                progress.dismissView ();
                //提示初始化菜单失败
                noticePop = new NoticePopWindow (  LoginActivity.this, "初始化菜单失败");
                noticePop.showNotice ();
                noticePop.showAtLocation (loginL , Gravity.CENTER, 0, 0 );
            }
            break;
        }
        return false;
    }

    /**
    * 方法描述：通过手机号码注册或者登录（当没有安装微信客户端，或者用户取消微信授权的时候，会提示手机登录方式）
    * 方法名称：
    * 参数：
    * 返回值：
    * 创建时间: 2015/12/8
    * 作者:jinxiangdong
    */
    protected void phoneLogin( String msg ){
        loginL.setClickable ( true );

        if( msgPopWindow==null ){
            msgPopWindow =new MsgPopWindow(this, new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(LoginActivity.this, PhoneLoginActivity.class);
                    LoginActivity.this.startActivity(intent);
                    LoginActivity.this.finish();
                }
            }, new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    msgPopWindow.dismiss();
                }
            },"询问",msg ,false);
            msgPopWindow.setWindowsStyle();
        }

        msgPopWindow.showAtLocation( getWindow().getDecorView() , Gravity.CENTER ,0,0 );
    }

}
