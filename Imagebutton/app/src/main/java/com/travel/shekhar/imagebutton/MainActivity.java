package com.travel.shekhar.imagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1= (ImageButton) findViewById(R.id.imageButton);
        i1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this,"Button Pressed",Toast.LENGTH_SHORT).show();

    }
}
