package com.example.karthi.moviedownload;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    public void tamilmovie(View view) {
        Intent intent = new Intent(MainActivity.this, tamil.class);
        startActivity(intent);

    }
    public void english(View view) {
        Intent intent = new Intent(MainActivity.this, english.class);
        startActivity(intent);
    }
}
