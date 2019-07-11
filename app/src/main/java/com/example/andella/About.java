package com.example.andella;

import android.app.Activity;
import android.app.ProgressDialog;
import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class About extends Activity {
     public WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        webView = findViewById(R.id.web);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://andela.com/alc/");
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
                handler.proceed();
            }
        });
    }
}
