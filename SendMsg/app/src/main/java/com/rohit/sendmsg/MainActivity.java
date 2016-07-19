package com.rohit.sendmsg;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et,et1;
    Button btn;
    Handler handler=new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et= (EditText) findViewById(R.id.editText);
        et1= (EditText) findViewById(R.id.editText2);
       // btn= (Button) findViewById(R.id.button);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final String s=et.getText().toString();
//                final String s1=et1.getText().toString();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //   SmsManager sm = SmsManager.getDefault();
                        //  sm.sendTextMessage(s, null, s1, null, null);
                        Intent i=new Intent(MainActivity.this,DataPassing.class);
                        startActivity(i);

                    }
                }, 5000);
            }
      //  });
    }

