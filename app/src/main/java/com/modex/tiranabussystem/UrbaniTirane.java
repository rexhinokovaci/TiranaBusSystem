package com.modex.tiranabussystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class UrbaniTirane extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urbani_tirane);


        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://opendata.tirana.al/?q=story/itinerari-i-15-linjave-t%C3%AB-transportit-publik-urban");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);




    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.canGoBack();
        }
        else {

            super.onBackPressed();
        }

    }


//        https://opendata.tirana.al/?q=story/itinerari-i-15-linjave-t%C3%AB-transportit-publik-urban
    }
}