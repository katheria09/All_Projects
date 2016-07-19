package com.travel.shekhar.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ToggleButton tb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb1= (ToggleButton) findViewById(R.id.toggleButton);
        tb1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        
    }
}
