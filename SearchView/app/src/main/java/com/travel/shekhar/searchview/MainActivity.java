package com.travel.shekhar.searchview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity  {
    String str[]={"Riya","Shekhar","Akshay","Anuj","Ayush","Vikrant","Tanu","Abhay","Jai","Vikram","Ishu","Divya","aysh","Arpita"};
    EditText sv;
    ListView lv;


    ArrayAdapter<String> ad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        lv = (ListView) findViewById(R.id.listView);
        sv = (EditText) findViewById(R.id.searchView);
        ad= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, str);
        lv.setAdapter(ad);
        sv.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                MainActivity.this.ad.getFilter().filter(s);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }
}
