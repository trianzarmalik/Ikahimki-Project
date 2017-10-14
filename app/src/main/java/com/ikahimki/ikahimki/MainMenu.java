package com.ikahimki.ikahimki;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ImageButton sejbtn;
    ImageButton adartbtn;
    ImageButton vismisbtn;
    ImageButton wilbtn;
    ImageButton medsosbtn;
    ImageButton lembtn;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

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

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent myint = new Intent(this, Tentang.class);
            startActivity(myint);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.berita_baru) {
            Intent myint = new Intent(this, Infokom.class);
            startActivity(myint);

        } else if (id == R.id.galeri_foto) {
            Intent myint = new Intent(this, GaleriFoto.class);
            startActivity(myint);
        } else if (id == R.id.unggah_file) {
            Intent myint = new Intent(this, UnggahFile.class);
            startActivity(myint);

        } else if (id == R.id.bagikan) {
            Intent i=new Intent(Intent.ACTION_SEND);
            String applink="https://play.google.com/store/apps/details?id=com.ikahimki.ikahimki";
            i.putExtra(Intent.EXTRA_SUBJECT,"Ikahimki App!");
            i.putExtra(Intent.EXTRA_TEXT,"Ayo Sebarkan!" +applink);
            i.setType("text/plain");
            startActivity(Intent.createChooser(i,"Bagikan Lewat"));


        } else if (id == R.id.kirim_inkuiri) {
            Intent i=new Intent(Intent.ACTION_SEND);
            i.setData(Uri.parse("email"));
            String[]s={"ikahimki.bpp@gmail.com","yoga14001@mail.unpad.ac.id"};
            i.putExtra(Intent.EXTRA_EMAIL,s);
            i.putExtra(Intent.EXTRA_SUBJECT,"Tuliskan Judul Inkuiri Anda!");
            i.putExtra(Intent.EXTRA_TEXT,"Sampaikan kritik, saran, pertanyaan anda secara rinci dan jelas");
            i.setType("message/ikahimki1618");
            Intent chooser=Intent.createChooser(i,"Kirim Inkuri lewat Surel");
            startActivity(chooser);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
