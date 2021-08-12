package com.modex.tiranabussystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ZonatVeriore extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zonat_veriore);



        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://tirana.al/pikat-e-interesit/terminale/terminali-i-autobusave-te-jugut-dhe-veriut");

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