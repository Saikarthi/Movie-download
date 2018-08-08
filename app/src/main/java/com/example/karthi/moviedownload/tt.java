package com.example.karthi.moviedownload;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class tt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tt);
        WebView k = (WebView) findViewById(R.id.webtt);
        WebSettings ka = k.getSettings();
        ka.setJavaScriptEnabled(true);
        k.loadUrl("http:www.tamilrockers.cl");


    }
}
