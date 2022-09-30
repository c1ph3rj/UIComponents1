package com.example.uicomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        RadioButton r1=(RadioButton) findViewById(R.id.radioButton1);
        RadioButton r2=(RadioButton) findViewById(R.id.radioButton2);
        RadioGroup group=(RadioGroup) findViewById(R.id.RadioGroup);
        RadioButton gr1= (RadioButton) findViewById(R.id.RadioGroupButton1);
        RadioButton gr2= (RadioButton) findViewById(R.id.RadioGroupButton2);
        Button next=(Button) findViewById(R.id.nextButton);
        Button previous=(Button) findViewById(R.id.previousButton);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNext();
            }
        });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPrevious();
            }
        });
    }
    void openPrevious(){
        Intent prev=new Intent(this,MainActivity.class);
        startActivity(prev);
    }
    void openNext(){
        Intent next=new Intent(this,ThirdActivity.class);
        startActivity(next);
    }
}