package com.example.karthi.moviedownload;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class et extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_et);
        WebView k2 = (WebView) findViewById(R.id.fu2);
        WebSettings ka2 = k2.getSettings();
        ka2.setJavaScriptEnabled(true);
        k2.loadUrl("http:www.yts.am");
    }
}
