package com.ikahimki.ikahimki;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class Fragment3 extends Fragment {
    ImageButton infokom;
    ImageButton humas;
    ImageButton litbang;
    ImageButton wirus;
    ImageButton kimling;
    ImageButton psdm;
    ImageButton ristek;
    ImageButton energi;
    ImageButton sosmapro;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fragment3,
                container, false);
        ImageButton infokom = (ImageButton) rootView.findViewById(R.id.infokombtn);
        infokom.setOnClickListener(new View.OnClickListener() {
                 @Override
                  public void onClick(View v) {
            infokom();
        }
        });
        ImageButton humas = (ImageButton) rootView.findViewById(R.id.prohumasbtn);
        humas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    humas();
                }
        });
        ImageButton litbang = (ImageButton) rootView.findViewById(R.id.prolitbangbtn);
        litbang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                litbang();
            }
        });
        ImageButton wirus = (ImageButton) rootView.findViewById(R.id.prowirusbtn);
        wirus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wirus();
            }
        });
        ImageButton kimling = (ImageButton) rootView.findViewById(R.id.prokimlingbtn);
        kimling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kimling();
            }
        });
        ImageButton psdm = (ImageButton) rootView.findViewById(R.id.propsdmbtn);
        psdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                psdm();
            }
        });
        ImageButton ristek = (ImageButton) rootView.findViewById(R.id.proristekbtn);
        ristek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ristek();
            }
        });
        ImageButton energi = (ImageButton) rootView.findViewById(R.id.proenergibtn);
        energi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                energi();
            }
        });
        ImageButton sosmapro = (ImageButton) rootView.findViewById(R.id.prososmabtn);
        sosmapro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sosmapro();
            }
        });
        return rootView;
    }
    public void infokom() {
        Intent intent = new Intent(getActivity(), Infokom.class);
        startActivity(intent);
    }
    public void humas() {
        Intent intent = new Intent(getActivity(), Humas.class);
        startActivity(intent);
    }
    public void litbang() {
        Intent intent = new Intent(getActivity(), Lit_Bang.class);
        startActivity(intent);
    }
    public void wirus() {
        Intent intent = new Intent(getActivity(), Wirus.class);
        startActivity(intent);
    }
    public void kimling() {
        Intent intent = new Intent(getActivity(), Kimling.class);
        startActivity(intent);
    }
    public void psdm() {
        Intent intent = new Intent(getActivity(), Psdm.class);
        startActivity(intent);
    }
    public void ristek() {
        Intent intent = new Intent(getActivity(), Ristek.class);
        startActivity(intent);
    }
    public void energi() {
        Intent intent = new Intent(getActivity(), Energi.class);
        startActivity(intent);
    }
    public void sosmapro() {
        Intent intent = new Intent(getActivity(), Sosmapro.class);
        startActivity(intent);
    }
}