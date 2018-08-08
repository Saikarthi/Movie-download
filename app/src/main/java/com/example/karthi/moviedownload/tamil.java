package com.example.karthi.moviedownload;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tamil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamil);

    }


    public void tt(View view) {
        Intent intent = new Intent(tamil.this, tt.class);
        startActivity(intent);
    }

    public void tnt(View view) {
        Intent intent = new Intent(tamil.this, tnt.class);
        startActivity(intent);
    }
}
