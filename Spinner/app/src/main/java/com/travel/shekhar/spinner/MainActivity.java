package com.travel.shekhar.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Spinner.OnItemSelectedListener {
    Spinner sp;
    String str[]={"Android","iPhone"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = (Spinner) findViewById(R.id.spinner);
        sp.setOnItemSelectedListener(this);
        ArrayAdapter<String>ad=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,str);
        sp.setAdapter(ad);


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(position==1)
        {
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
