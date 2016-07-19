package com.example.onelove.seekbar;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    SeekBar sb;
    TextView t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sb= (SeekBar) findViewById(R.id.seekBar);
        t= (TextView) findViewById(R.id.textView2);
        sb.setOnSeekBarChangeListener(this);



    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        t.setText(""+progress);
        if (progress==50){
            Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();//will generate toast
            Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE_SECURE);// will open camera
            startActivity(i);
        }

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }


}
