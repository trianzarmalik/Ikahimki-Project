package com.ikahimki.ikahimki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MedSos extends AppCompatActivity {
    ImageButton situs;
    ImageButton line;
    ImageButton instag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_sos);
        situs = (ImageButton) findViewById(R.id.buttonweb1);
        line = (ImageButton) findViewById(R.id.buttonline1);
        instag = (ImageButton) findViewById(R.id.buttonig1);
    }

    public void SitusBtn(View view) {
        Intent intent = new Intent(this, Website.class);
        startActivity(intent);
    }

    public void LineBtn(View view) {
        Toast.makeText(this, "Silakan buka LINE dan tambahkan ID @qnr8959k !", Toast.LENGTH_LONG).show();
    }

    public void IgBtn(View view) {
        Intent intent = new Intent(this, Website3.class);
        startActivity(intent);
    }
}
