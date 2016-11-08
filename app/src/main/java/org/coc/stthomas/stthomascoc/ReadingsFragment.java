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
public class ReadingsFragment extends Fragment{


    public ReadingsFragment() {



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_readings, container, false);
        //Inflate the layout for this fragment

        WebView webView = (WebView) rootView.findViewById(R.id.webview);
        webView.loadUrl("http://www.suscopts.org/readings/");

        // Enable Javascipt
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

        //Enable zoom
        webView.getSettings().setBuiltInZoomControls(true);


        return rootView;






    }

}

