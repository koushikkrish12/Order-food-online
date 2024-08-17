package com.example.orderfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class booking extends AppCompatActivity {

    CheckBox cb1,cb2,cb3,cb4,cb5;
    Button order;
    TextView Bill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        cb1=findViewById(R.id.briyani);
        cb3=findViewById(R.id.idly);
        cb4=findViewById(R.id.sambar);
        order=findViewById(R.id.book);
        Bill=findViewById(R.id.bill);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int total=0;

                if(cb1.isChecked()){
                    total=total+90;
                }
                if(cb2.isChecked()){
                    total=total+60;
                }
                if(cb3.isChecked()){
                    total=total+70;
                }
                if(cb4.isChecked()){
                    total=total+80;
                }
                if(cb5.isChecked()){
                    total=total+100;
                }

                Bill.setText("your bill is"+String.valueOf(total));
                Toast.makeText(booking.this, "Booking is confirmed", Toast.LENGTH_SHORT).show();
            }
        });


    }
}