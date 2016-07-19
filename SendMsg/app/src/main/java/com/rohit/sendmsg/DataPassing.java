package com.rohit.sendmsg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DataPassing extends AppCompatActivity {
    EditText et;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_passing);
        et= (EditText) findViewById(R.id.editText3);
        btn= (Button) findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=et.getText().toString();
                Intent i=new Intent(DataPassing.this,Main2Activity.class);
                i.putExtra("k",s);
                startActivity(i);
            }
        });
    }
}
