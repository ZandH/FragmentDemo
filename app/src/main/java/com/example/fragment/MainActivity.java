package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fragment.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFragments();


    }

    //初始化Fragaments
    private void initFragments(){

    }
}