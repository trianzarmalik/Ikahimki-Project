package com.ikahimki.ikahimki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.ikahimki.ikahimki.R;

public class Sejarah extends AppCompatActivity {
    WebView websej;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah);
        websej=(WebView) findViewById(R.id.sejarahtxt);
        websej.getSettings().setSupportZoom(true);
        websej.loadUrl("file:///android_asset/web/sejarah.html");
    }
}
