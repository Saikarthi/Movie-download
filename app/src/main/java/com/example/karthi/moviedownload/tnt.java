package com.example.karthi.moviedownload;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class tnt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tnt);
        WebView k1 = (WebView) findViewById(R.id.ka1);
        WebSettings ka1 = k1.getSettings();
        ka1.setJavaScriptEnabled(true);
        k1.loadUrl("http:www.isaimini.co");
    }
}
