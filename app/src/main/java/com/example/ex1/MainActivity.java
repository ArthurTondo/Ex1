package com.example.ex1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        setTitle("Poupanca");
        actionBar.setIcon(R.drawable.poupanca_icon);
        setContentView(R.layout.activity_main);
    }
}
