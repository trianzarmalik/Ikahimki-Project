package com.ikahimki.ikahimki;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    //deklarasi variabel untuk menampung jumlah tab menu yang ada
    int tabCount;

    //konstruktor
    public PagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        //menginisialisasi tabcount
        this.tabCount = tabCount;
    }

    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Fragment tab1 = new Fragment1(); //menginstansiasi objek baru yaitu Fragment1.java
                return tab1;
            case 1:
                Fragment tab2 = new Fragment2(); //menginstansiasi objek baru yaitu Fragment2.java
                return tab2;
            case 2:
                Fragment tab3 = new Fragment3(); //menginstansiasi objek baru yaitu Fragment3.java
                return tab3;
            default:
                return null;
        }


    }

    //Overriden method getCount untuk mengambil jumlah dari tab menu
    @Override
    public int getCount() {
        return tabCount;
    }

}