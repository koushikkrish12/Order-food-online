package com.example.orderfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton floatingActionButton=findViewById(R.id.fabbtn);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent myIntent = new Intent(Intent.ACTION_SEND);
                 myIntent.setType("text/plain");
                 String shareBody = "https://www.swiggy.com/";
                 String shareSub = "https://www.swiggy.com/";
                 myIntent.putExtra(Intent.EXTRA_SUBJECT,shareBody);
                 myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                 startActivity(Intent.createChooser(myIntent, "Share using"));
            }


        });
    }

    public void book(View view) {
        Intent intent=new Intent(this, booking.class);
        startActivity(intent);
    }
    public void branches(View view){
        Intent intent=new Intent(this, branches.class);
        startActivity(intent);
    }
    public void click(View view){
        Toast.makeText(this, "order now!!!!", Toast.LENGTH_SHORT).show();
    }

    public void insta(View view) {
        Intent intent=new Intent(this, insta.class);
        startActivity(intent);
    }
}