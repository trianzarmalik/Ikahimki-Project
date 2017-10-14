package com.ikahimki.ikahimki;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Wilayah2 extends AppCompatActivity {
    ImageButton korwil1;
    ImageButton korwil2;
    ImageButton korwil3;
    ImageButton korwil4;
    ImageButton korwil5;
    ImageButton korwil6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wilayah2);
        korwil1=(ImageButton) findViewById(R.id.korwil1);
        korwil2=(ImageButton) findViewById(R.id.korwil2);
        korwil3=(ImageButton) findViewById(R.id.korwil3);
        korwil4=(ImageButton) findViewById(R.id.korwil4);
        korwil5=(ImageButton) findViewById(R.id.korwil5);
        korwil6=(ImageButton) findViewById(R.id.korwil6);}
    public void kor1 (View view){
        Intent intent= new Intent(this, Korwil1Frag.class);
        startActivity(intent);
    }
    public void kor2 (View view){
        Intent intent= new Intent(this, Korwil2Frag.class);
        startActivity(intent);
    }
    public void kor3 (View view){
        Intent intent= new Intent(this, Korwil3Frag.class);
        startActivity(intent);
    }
    public void kor4 (View view){
        Intent intent= new Intent(this, Korwil4Frag.class);
        startActivity(intent);
    }
    public void kor5 (View view){
        Intent intent= new Intent(this, Korwil5Frag.class);
        startActivity(intent);
    }
    public void kor6 (View view){
        Intent intent= new Intent(this, Korwil6Frag.class);
        startActivity(intent);
    }
}

