package com.travel.shekhar.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

RadioButton r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1= (RadioButton) findViewById(R.id.radioButton);
        r2= (RadioButton) findViewById(R.id.radioButton2);

        r1.setOnClickListener(this);
        r2.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view==r1)
        {
            Toast.makeText(MainActivity.this, "ANDROID", Toast.LENGTH_SHORT).show();
        }
        if (view==r2)
        {
            Toast.makeText(MainActivity.this, "iPhone", Toast.LENGTH_SHORT).show();
        }

    }
}
