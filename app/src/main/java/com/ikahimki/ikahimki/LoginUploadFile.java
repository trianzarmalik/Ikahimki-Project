package com.ikahimki.ikahimki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LoginUploadFile extends AppCompatActivity {
    WebView webaa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_upload_file);
        webaa = (WebView) findViewById(R.id.upload_web);
        webaa.getSettings().setSupportZoom(true);
        webaa.loadUrl("http://bit.ly/2xGdq9A");
    }
}