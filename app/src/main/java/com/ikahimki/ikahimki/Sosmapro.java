package com.ikahimki.ikahimki;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

public class Sosmapro extends AppCompatActivity {

    WebView webaa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_sosmapro);
        webaa = (WebView) findViewById(R.id.icv);
        webaa.getSettings().setSupportZoom(true);
        webaa.loadUrl("file:///android_asset/web/icv_bina_desa.html");
    }
}
