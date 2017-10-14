package com.ikahimki.ikahimki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GaleriFoto extends AppCompatActivity {

    WebView situs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri_foto);
        situs=(WebView) findViewById(R.id.galeri_foto);
        situs.setWebViewClient(new WebViewClient());
        situs.getSettings().setSupportZoom(true);
        situs.loadUrl("http://www.ikahimki.com/p/galeri-foto.html");
    }
}