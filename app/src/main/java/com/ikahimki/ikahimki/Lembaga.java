package com.ikahimki.ikahimki;

import android.support.v4.view.ViewPager; //import ViewPager, viewpager berfungsi untuk mengontrol posisi tab
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout; //import TabLayout, TabLayout berfungsi untuk membuat menu tab layout

public class Lembaga extends AppCompatActivity {

    private TabLayout tabLayout; //Deklarasi Tab Layout

    private ViewPager viewPager; //Deklarasi view pager

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lembaga);

        // tablayout
        tabLayout = (TabLayout) findViewById(R.id.tabLayout); //mengenalkan komponen tab layout yang berada di activity_main ke MainActivity.java
        tabLayout.addTab(tabLayout.newTab().setText("Profil")); //Nama menu tab yang pertama
        tabLayout.addTab(tabLayout.newTab().setText("Struktur"));
        tabLayout.addTab(tabLayout.newTab().setText("Proker"));//Nama menu tab yang kedua
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER); //membuat rata tengah posisi tab layout


        //viewpager
        viewPager = (ViewPager) findViewById(R.id.viewPager); //mengenalkan komponen view pager yang berada di activity_main ke MainActivity.java
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount()); //menerapkan page adapter PageAdapter.java


        //Menambahkan adapter ke pager
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition()); //menampilkan fragment pada posisi tab menu yang sedang di klik
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });

    }
}