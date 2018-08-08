package com.example.karthi.moviedownload;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class ent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ent);
        WebView k3 = (WebView) findViewById(R.id.fa1);
        WebSettings ka3 = k3.getSettings();
        ka3.setJavaScriptEnabled(true);
        k3.loadUrl("http:www.hdpopcorns.co");
    }
}
