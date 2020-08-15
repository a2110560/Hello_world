package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.HashSet;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void create(View view) {
        HashSet<Integer> set=new HashSet<>();//不會重複的函數

        while(set.size()<6){
            set.add((int)(Math.random()*49+1));//49為數字個數 1為開頭是甚麼數字
        }

    }
}