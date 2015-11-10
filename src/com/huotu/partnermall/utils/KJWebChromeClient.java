package com.huotu.partnermall.utils;

import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;

/**
 * 自定义WebChromeClient
 */
public
class KJWebChromeClient extends WebChromeClient {

    private WebChromeClient mWrappedClient;

    public WebChromeClient webChromeClient;
    public
    KJWebChromeClient ( WebChromeClient webChromeClient ) {
        super ( );
        this.webChromeClient = webChromeClient;
    }

    @Override
    public
    void onProgressChanged ( WebView view, int newProgress ) {
        webChromeClient.onProgressChanged ( view, newProgress );
    }

    @Override
    public
    void onReceivedTitle ( WebView view, String title ) {
        webChromeClient.onReceivedTitle ( view, title );
    }

    @Override
    public
    void onReceivedIcon ( WebView view, Bitmap icon ) {
        webChromeClient.onReceivedIcon ( view, icon );
    }

    @Override
    public
    void onReceivedTouchIconUrl ( WebView view, String url, boolean precomposed ) {
        webChromeClient.onReceivedTouchIconUrl ( view, url, precomposed );
    }

    @Override
    public
    void onShowCustomView ( View view, CustomViewCallback callback ) {
        webChromeClient.onShowCustomView ( view, callback );
    }

    @Override
    public
    void onHideCustomView ( ) {
        webChromeClient.onHideCustomView ( );
    }

    @Override
    public
    boolean onCreateWindow ( WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg ) {
        return webChromeClient.onCreateWindow ( view, isDialog, isUserGesture, resultMsg );
    }

    @Override
    public
    void onRequestFocus ( WebView view ) {
        webChromeClient.onRequestFocus ( view );
    }

    @Override
    public
    void onCloseWindow ( WebView window ) {
        webChromeClient.onCloseWindow ( window );
    }

    @Override
    public
    boolean onJsAlert ( WebView view, String url, String message, JsResult result ) {
        return webChromeClient.onJsAlert ( view, url, message, result );
    }

    @Override
    public
    boolean onJsConfirm ( WebView view, String url, String message, JsResult result ) {
        return webChromeClient.onJsConfirm ( view, url, message, result );
    }

    @Override
    public
    boolean onJsPrompt ( WebView view, String url, String message, String defaultValue,
                         JsPromptResult result ) {
        return webChromeClient.onJsPrompt ( view, url, message, defaultValue, result );
    }

    @Override
    public
    boolean onJsBeforeUnload ( WebView view, String url, String message, JsResult result ) {
        return webChromeClient.onJsBeforeUnload ( view, url, message, result );
    }

    @Override
    public
    void onGeolocationPermissionsShowPrompt ( String origin, GeolocationPermissions.Callback
            callback ) {
        webChromeClient.onGeolocationPermissionsShowPrompt ( origin, callback );
    }

    @Override
    public
    void onGeolocationPermissionsHidePrompt ( ) {
        webChromeClient.onGeolocationPermissionsHidePrompt ( );
    }

    @Override
    public
    boolean onConsoleMessage ( ConsoleMessage consoleMessage ) {
        return webChromeClient.onConsoleMessage ( consoleMessage );
    }

    @Override
    public
    Bitmap getDefaultVideoPoster ( ) {
        return webChromeClient.getDefaultVideoPoster ( );
    }

    @Override
    public
    View getVideoLoadingProgressView ( ) {
        return webChromeClient.getVideoLoadingProgressView ( );
    }

    @Override
    public
    void getVisitedHistory ( ValueCallback< String[] > callback ) {
        webChromeClient.getVisitedHistory ( callback );
    }
}
