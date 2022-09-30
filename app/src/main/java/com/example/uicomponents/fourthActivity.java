package com.example.uicomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

public class fourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        DatePicker date=(DatePicker) findViewById(R.id.dateselect);
        TimePicker time=(TimePicker) findViewById(R.id.timeselect);
        Button selectDate=(Button) findViewById(R.id.selectdate);
        Button selectTime=(Button) findViewById(R.id.selecttime);
        Button submit=(Button) findViewById(R.id.submit);
        Button end=(Button) findViewById(R.id.end);
        selectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                date.setVisibility(View.VISIBLE);
                time.setVisibility(View.INVISIBLE);
                submit.setVisibility(View.VISIBLE);
                selectDate.setVisibility(View.INVISIBLE);
                selectTime.setVisibility(View.INVISIBLE);
            }
        });
        selectTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time.setVisibility(View.VISIBLE);
                date.setVisibility(View.INVISIBLE);
                end.setVisibility(View.VISIBLE);
                selectTime.setVisibility(View.INVISIBLE);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                date.setVisibility(View.INVISIBLE);
                time.setVisibility(View.INVISIBLE);
                submit.setVisibility(View.INVISIBLE);
                selectDate.setVisibility(View.INVISIBLE);
                selectTime.setVisibility(View.VISIBLE);
            }
        });
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home();
            }
        });

    }
    void home(){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}