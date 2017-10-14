package com.ikahimki.ikahimki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;


public class AdArt extends AppCompatActivity {
    WebView webaa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_art);
        webaa = (WebView) findViewById(R.id.adart);
        webaa.getSettings().setSupportZoom(true);
        webaa.loadUrl("file:///android_asset/web/adart.html");
    }
}