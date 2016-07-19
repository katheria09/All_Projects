package com.travel.shekhar.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox ch1,ch2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         ch1= (CheckBox) findViewById(R.id.checkBox);
         ch2= (CheckBox) findViewById(R.id.checkBox2);
         ch1.setOnClickListener(this);
         ch2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view==ch1) {
            Toast.makeText(MainActivity.this, "ANDROID", Toast.LENGTH_SHORT).show();
        }
        if (view==ch2){
            Toast.makeText(MainActivity.this, "iPHONE", Toast.LENGTH_SHORT).show();
        }
    }
}
