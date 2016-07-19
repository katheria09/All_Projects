package com.travel.shekhar.tabhost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TabHost tabHost;
    EditText t1,t2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1= (EditText) findViewById(R.id.editText);
        t2= (EditText) findViewById(R.id.editText2);
        btn= (Button) findViewById(R.id.button);
        btn.setOnClickListener(MainActivity.this);



        tabHost= (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();
        TabHost.TabSpec tt=tabHost.newTabSpec("anythingskfn");
        tt.setIndicator("LOGIN");
        tt.setContent(R.id.linearLayout);
        tabHost.addTab(tt);

        tt=tabHost.newTabSpec("anythingskfn");
        tt.setIndicator("App Info");
        tt.setContent(R.id.linearLayout2);
        tabHost.addTab(tt);

        tt=tabHost.newTabSpec("anythingskfn");
        tt.setIndicator("Developer Profile");
        tt.setContent(R.id.linearLayout3);
        tabHost.addTab(tt);


    }

    @Override
    public void onClick(View v) {

        String value =t1.getText().toString();
        String value2 = t2.getText().toString();


//        StringBuffer value = new StringBuffer(t1.getText().toString());
  //      StringBuffer value2 = new StringBuffer(t2.getText().toString());


        if (value.equals(value2))
        {
            Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this,"Wrong User id and Password",Toast.LENGTH_SHORT).show();
        }



    }
}
