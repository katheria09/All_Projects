package com.example.shekh.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String str[]={"Delhi","Chennai","Kolkata","Mumbai","Hyderabad","Bangalore"};

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView mylist= (ListView) findViewById(R.id.mylist);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,str);
        mylist.setAdapter(ad);
        mylist.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position==0) {
            Intent page1 = new Intent("com.example.shekh.myapplication.delhi");
            startActivity(page1);



        }

    }
}
