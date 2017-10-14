package com.ikahimki.ikahimki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Website3 extends AppCompatActivity {
    WebView situs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website3);
        situs=(WebView) findViewById(R.id.instagram);
        situs.getSettings().setSupportZoom(true);
        situs.loadUrl("http://www.instagram.com/ikahimki/");
    }
}