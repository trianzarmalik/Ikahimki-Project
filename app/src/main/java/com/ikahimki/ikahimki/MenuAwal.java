package com.ikahimki.ikahimki;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuAwal extends AppCompatActivity {
    ImageButton tombolmnu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_awal);
        tombolmnu=(ImageButton) findViewById(R.id.tolmen);
    }
    public void MasukMenuBtn1 (View view){
        Intent intent= new Intent(this, MainMenu.class);
        startActivity(intent);
    }
}
