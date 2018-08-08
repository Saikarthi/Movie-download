package com.example.karthi.moviedownload;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class english extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
    }

    public void ent(View view) {
        Intent intent = new Intent(english.this,ent.class);
        startActivity(intent);
    }

    public void et(View view) {
        Intent intent = new Intent(english.this, et.class);
        startActivity(intent);
    }
}
