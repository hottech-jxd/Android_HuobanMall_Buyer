package com.huotu.partnermall.config;

import android.os.Environment;

public class Constants {
	/**
	 ******************************************* 参数设置信息开始 ******************************************
	 */

	// 保存参数文件夹名字
	public static final String SHARED_PREFERENCE_NAME = "account_info";

	// SDCard路径
	public static final String SD_PATH = Environment
			.getExternalStorageDirectory().getAbsolutePath();

	// 手机IMEI号码
	public static String IMEI = "";

	// 手机号码
	public static String TEL = "";

	// 屏幕高度
	public static int SCREEN_HEIGHT = 800;

	// 屏幕宽度
	public static int SCREEN_WIDTH = 480;

	// 屏幕密度
	public static float SCREEN_DENSITY = 1.5f;

	// 分享成功
	public static final int SHARE_SUCCESS = 0X1000;

	// 分享取消
	public static final int SHARE_CANCEL = 0X2000;

	// 分享失败
	public static final int SHARE_ERROR = 0X3000;

	// 开始执行
	public static final int EXECUTE_LOADING = 0X4000;

	// 正在执行
	public static final int EXECUTE_SUCCESS = 0X5000;

	// 执行完成
	public static final int EXECUTE_FAILED = 0X6000;

	// 加载数据成功
	public static final int LOAD_DATA_SUCCESS = 0X7000;

	// 加载数据失败
	public static final int LOAD_DATA_ERROR = 0X8000;

	// 动态加载数据
	public static final int SET_DATA = 0X9000;

	// 未登陆
	public static final int NONE_LOGIN = 0X10000;

	/**
	 ******************************************* 参数设置信息结束 ******************************************
	 */

	//标准时间
	public final static String TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	//标准时间01
	public static final String DATE_FORMAT = "yyyy-MM-dd";

	/**
	 * ************************************商户信息xml节点***********************
	 */
	//app信息
	public static final String APP_INFO = "appinfo";
	//app版本号
	public static final String APP_VERSION = "app_version";
	//app名称
	public static final String APP_NAME = "app_name";
	//app_build
	public static final String APP_BUILD = "app_build";


	//商户信息
	public static final String MERCHANT = "MERCHANT";
	//商户ID
	public static final String MERCHANT_ID = "merchant_id";

	//微信支付信息
	public static final String WEIXIN_PAY = "weixinpay";
	//微信商家编号
	public static final String WEIXIN_MERCHANT_ID = "weixin_merchant_id";
	//商家微信编号
	public static final String MERCHANT_WEIXIN_ID = "merchant_weixin_id";
	//商户微信支付KEY信息
	public static final String WEIXIN_KEY = "weixin_key";
	//支付宝商家编号
	public static final String ALIPAY_MERCHANT_ID = "alipay_merchant_id";
	//商家支付宝编号
	public static final String MERCHANT_ALIPAY_ID = "merchant_alipay_id";
	//商户支付宝KEY信息
	public static final String ALIPAY_KEY = "alipay_key";

	//UMENG统计信息
	public static final String U_MENG = "umeng";
	//UMENG app key
	public static final String U_MENG_KEY = "umeng_appkey";
	//umeng_channel
	public static final String U_MENG_CHANNEL = "umeng_channel";
	//umeng_message_secret
	public static final String U_MENG_SECRET = "umeng_message_secret";
	//网络请求
	public static final String HTTP_PREFIX = "httpprefix";
	//网络请求前缀
	public static final String PREFIX = "prefix";
	//分享
	public static final String SHARE_INFO = "shareinfo";
	//share KEY
	public static final String SHARE_KEY = "share_key";
	//tencent_key
	public static final String TENCENT_KEY = "tencent_key";
	//tencent_secret
	public static final String TENCENT_SECRET = "tencent_secret";
	//sina_key
	public static final String SINA_KEY = "sina_key";
	//sina_secret
	public static final String SINA_SECRET = "sina_secret";
	//sina_redirect_uri
	public static final String SINA_REDIRECT_URI = "sina_redirect_uri";
	//weixin SHARE key
	public static final String WEIXIN_SHARE_key = "weixin_share_key";
	//推送信息
	public static final String PUSH_INFO = "push_info";
	//推送key
	public static final String PUSH_KEY = "push_key";

	//定位key
	public static final String LOCATION_KEY = "location_key";


	//主菜单
	public static final String HOME_MENU = "home_menu";
	//主菜单名称
	public static final String MENU_NAME = "menu_name";
	//主菜单标识
	public static final String MENU_TAG = "menu_tag";

	/**
	 * *******************preference参数设置
	 */
	//商户信息
	public static final String MERCHANT_INFO = "merchant_info";
	//商户ID
	public static final String MERCHANT_INFO_ID = "merchant_id";
	//商户支付宝key信息
	public static final String MERCHANT_INFO_ALIPAY_KEY = "merchant_alipay_key";
	//商户微信支付KEY信息
	public static final String MERCHANT_INFO_WEIXIN_KEY = "merchant_weixin_key";
	//商户菜单
	public static final String MERCHANT_INFO_MENUS = "main_menus";
	//商户分类菜单
	public static final String MERCHANT_INFO_CATAGORY = "catagory_menus";
	//商家url请求渠道
	public static final String HTTP_PREFIX_MERCHANT = "merchant_channel";

	/**
	 * ************************定位信息设置
	 */
	public static final String LOCATION_INFO = "location_info";
	public static final String ADDRESS = "address";
	public static final String LATITUDE = "latitude";
	public static final String LONGITUDE = "Longitude";
	public static final String CITY = "city";

	/**
	 * 底部Tab菜单
	 */
	public static final String TAB_1 = "TAB_1";
	public static final String TAB_2 = "TAB_2";
	public static final String TAB_3 = "TAB_3";
	public static final String TAB_4 = "TAB_4";
	public static final String TAB_5 = "TAB_5";
	public static final String TAB_6 = "TAB_6";

	//http请求参数
	//获取具体页面的商品类别
	public static final String HTTP_OBTAIN_CATATORY = "/goods/obtainCatagory?";
	//获取商品信息
	public static final String HTTP_OBTAIN_GOODS = "/goods/obtainGoods?";
	//new view
	public static final String WEB_TAG_NEWFRAME = "__newframe";
	//上传图片
	public static final String WEB_TAG_COMMITIMG = "partnermall520://pickimage";
	//登出
	public static final String WEB_TAG_LOGOUT = "partnermall520://logout";
	//信息保护
	public static final String WEB_TAG_INFO = "partnermall520://togglepb";
	//关闭当前页
	public static final String WEB_TAG_FINISH = "partnermall520://closepage";
	//share
	public static final String WEB_TAG_SHARE = "partnermall520://shareweb";
	//弹出框
	public static final String WEB_TAG_ALERT = "partnermall520://alert";
	//支付
	public static final String WEB_TAG_PAYMENT = "partnermall520://payment";

	//是否测试环境
	public static final boolean IS_TEST = true;

	//handler code
	//1、success
	public static final int SUCCESS_CODE = 0;
	//2、error code
	public static final int ERROR_CODE = 1;
	//3、null code
	public static final int NULL_CODE = 2;
}