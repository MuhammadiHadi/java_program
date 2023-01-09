package com.example.java_program;

import static com.example.java_program.R.id.button;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button=findViewById(R.id.btn);
        Button btn=findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(i);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(i);
            }
        });


    }
}