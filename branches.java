package com.example.orderfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class branches extends AppCompatActivity {
    ListView lv;
    String branches[]={"thokavadi","tharamangalam","linemedu","morepalayam","jalagandapuram"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branches);
        lv = findViewById(R.id.listview);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(
                this,
                        androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                        branches);
        lv.setAdapter(arr);
    }
}