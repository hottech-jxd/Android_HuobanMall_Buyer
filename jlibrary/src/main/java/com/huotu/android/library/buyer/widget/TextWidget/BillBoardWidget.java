package com.huotu.android.library.buyer.widget.TextWidget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.widget.TextView;

import com.huotu.android.library.buyer.bean.TextBean.BillBoardConfig;
import com.huotu.android.library.buyer.utils.DensityUtils;
import com.huotu.android.library.buyer.utils.Logger;

/**
 * 公告组件
 * Created by jinxiangdong on 2016/1/7.
 */
public class BillBoardWidget extends TextView {
    private BillBoardConfig billBoardConfig;

    public BillBoardWidget(Context context , BillBoardConfig billBoardConfig) {
        super(context);
        this.billBoardConfig=billBoardConfig;

        try {
            this.setBackgroundColor(Color.parseColor( this.billBoardConfig.getWidgetBackColor()));
        }catch (Exception ex){
            Logger.e(ex.getMessage(), ex);
        }
        try{
            this.setTextColor( Color.parseColor( this.billBoardConfig.getWidgetFontColor() ) );
        }catch (Exception ex){
            Logger.e(ex.getMessage(),ex);
        }
        this.setSingleLine();
        this.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.setMarqueeRepeatLimit(-1);
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);

        //this.setPadding( this.billBoardConfig.getLeftMargin() , this.billBoardConfig.getTopMargin(),this.billBoardConfig.getRightMargin() , this.billBoardConfig.getBottomMargin() );
        int leftPadding = DensityUtils.dip2px(getContext(), 4);
        int topPadding = DensityUtils.dip2px( getContext() , 7);
        int rightPadding = leftPadding;
        int bottomPadding = topPadding;
        this.setPadding(leftPadding, topPadding,rightPadding,bottomPadding);

        this.setText( this.billBoardConfig.getContent() );
    }

    @Override
    public boolean isFocused() {
        //return super.isFocused();
        return true;
    }
}
