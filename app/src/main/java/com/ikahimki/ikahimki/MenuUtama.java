package com.ikahimki.ikahimki;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuUtama extends AppCompatActivity {
    ImageButton sejbtn;
    ImageButton adartbtn;
    ImageButton vismisbtn;
    ImageButton wilbtn;
    ImageButton medsosbtn;
    ImageButton lembtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_utama);
        sejbtn=(ImageButton) findViewById(R.id.profilbtn);
        adartbtn=(ImageButton) findViewById(R.id.adartbtn);
        vismisbtn=(ImageButton) findViewById(R.id.vismisbtn);
        lembtn=(ImageButton) findViewById(R.id.lembtn);
        wilbtn=(ImageButton) findViewById(R.id.wilbtn);
        medsosbtn=(ImageButton) findViewById(R.id.medsosbtn);}

    public void Sejbtn (View view){
        Intent intent= new Intent(this, Sejarah.class);
        startActivity(intent);
    }
    public void AdartBtn (View view){
        Intent intent= new Intent(this, AdArt.class);
        startActivity(intent);
    }
    public void VisMisBtn (View view){
        Intent intent= new Intent(this, VisiMisi.class);
        startActivity(intent);
    }
    public void LemBtn (View view){
        Intent intent= new Intent(this, Lembaga.class);
        startActivity(intent);
    }
    public void WilBtn (View view){
        Intent intent= new Intent(this, Wilayah2.class);
        startActivity(intent);
    }
    public void MedBtn (View view){
        Intent intent= new Intent(this, MedSos.class);
        startActivity(intent);
    }
    public void EventIka (View view){
        Intent intent= new Intent(this, Website2.class);
        startActivity(intent);

    }
}

