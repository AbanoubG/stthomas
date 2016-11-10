package org.coc.stthomas.stthomascoc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;



/**
 * A simple {@link Fragment} subclass.
 * */
public class AltarFragment extends Fragment{


    public AltarFragment() {



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_altar, container, false);
        //Inflate the layout for this fragment

        WebView webView = (WebView) rootView.findViewById(R.id.webview);
        webView.loadUrl("https://stthomascoc.com/wp-content/uploads/2016/11/IMG_20161016_084751.jpg");

        // Enable Javascipt
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

        //Enable zoom
        webView.getSettings().setBuiltInZoomControls(true);
        int default_zoom_level=100;
        webView.setInitialScale(default_zoom_level);


        return rootView;






    }

}

