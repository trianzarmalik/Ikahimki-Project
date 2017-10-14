package com.ikahimki.ikahimki;

        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.webkit.WebView;


public class Fragment1 extends Fragment {
    WebView webaa;


    public Fragment1() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fragment1, container, false);
        WebView webView = (WebView)rootView.findViewById(R.id.profilbpp);
        String HTML = "Profil BPP";
        webView.loadUrl("file:///android_asset/web/profil.html");

        return rootView;

    }
}
