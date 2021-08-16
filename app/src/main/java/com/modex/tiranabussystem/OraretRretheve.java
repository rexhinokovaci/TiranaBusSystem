package com.modex.tiranabussystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class OraretRretheve extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oraret_rretheve);


        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://tiranaparking.al/terminali-i-autobuzave-nderqytetas-zona-jug/");

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
}

// TODO: 8/13/2021 vendos ato ne web foto per oraret veriu dhe jugu tek web ne git