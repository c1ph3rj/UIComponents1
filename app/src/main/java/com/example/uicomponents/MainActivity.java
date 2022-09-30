package com.example.uicomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView signUp= (TextView) findViewById(R.id.textview1);
        EditText userName=(EditText) findViewById(R.id.textBox);
        Button btn=(Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecond();
            }


        });
    }
    void openSecond(){
        Intent next=new Intent(this,SecondActivity.class);
        startActivity(next);
    }



}