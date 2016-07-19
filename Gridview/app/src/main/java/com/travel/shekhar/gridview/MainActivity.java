package com.travel.shekhar.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {
    String str[]={"Delhi","Mumbai","Kolkata","Chennai","Bangalore","Hyderabad"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView mygrid= (GridView) findViewById(R.id.gridView);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,str);
        mygrid.setAdapter(ad);
        mygrid.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position==0) {
            Toast.makeText(MainActivity.this,"clicked",Toast.LENGTH_SHORT).show();
        }

    }
}
