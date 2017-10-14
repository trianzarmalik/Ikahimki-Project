package com.ikahimki.ikahimki;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

public class Wirus extends AppCompatActivity {

        WebView webaa;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.content_wirus);
            webaa = (WebView) findViewById(R.id.i_fundation);
            webaa.getSettings().setSupportZoom(true);
            webaa.loadUrl("file:///android_asset/web/i_fundation.html");
        }
    }
