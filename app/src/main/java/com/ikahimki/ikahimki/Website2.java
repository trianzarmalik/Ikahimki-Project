package com.ikahimki.ikahimki;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;



public class Website2 extends AppCompatActivity {
    WebView line;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website2);
        line = (WebView) findViewById(R.id.eventika);
        line.getSettings().setSupportZoom(true);
        line.loadUrl("http://www.instagram.com/eventikahimki/");
    }
}