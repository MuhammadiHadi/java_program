package com.example.java_program;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private int counter=0;
    private  TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button btn_one=findViewById(R.id.increase);
        Button btn_two=findViewById(R.id.decrease);
       textView =findViewById(R.id.count);


        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Increase();
            }
        });
        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Decrease();
            }
        });



    }

    void  Increase(){

        counter++;
        textView.setText(""+counter);

    }
    void  Decrease(){
        counter--;
        textView.setText(""+counter);
    }

}