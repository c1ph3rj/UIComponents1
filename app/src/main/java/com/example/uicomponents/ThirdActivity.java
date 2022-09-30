package com.example.uicomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Spinner n=(Spinner) findViewById(R.id.dropdownspinner);
        Button b=(Button) findViewById(R.id.buttonin3);
        ProgressBar p=(ProgressBar) findViewById(R.id.progBar);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.setVisibility(View.VISIBLE);
                OntoNext();
            }
        });

    }
    void OntoNext(){
        Intent i=new Intent(this,fourthActivity.class);
        startActivity(i);
    }
}