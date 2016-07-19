package com.travel.shekhar.tourist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String str[]={"Delhi","Mumbai","Kolkata","Chennai","Bangalore","Hyderabad"};

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView mylist= (ListView) findViewById(R.id.list);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,str);
        mylist.setAdapter(ad);
        mylist.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position==0) {
            startActivity(new Intent("com.travel.shekhar.tourist.delhi"));
        }
        if(position==1) {
            startActivity(new Intent("com.travel.shekhar.tourist.mumbai"));
        }
        if(position==2) {
            startActivity(new Intent("com.travel.shekhar.tourist.kolkata"));
        }

        if(position==3) {
            startActivity(new Intent("com.travel.shekhar.tourist.chennai"));
        }
        if(position==4) {
            startActivity(new Intent("com.travel.shekhar.tourist.bangalore"));
        }
        if(position==5) {
            startActivity(new Intent("com.travel.shekhar.tourist.hyderabad"));
        }


    }
}
