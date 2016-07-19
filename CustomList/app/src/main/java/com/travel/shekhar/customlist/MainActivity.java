package com.travel.shekhar.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String str[]={"DUCAT","ASD","LKJH","FJFE","KKR"};
    String str1[]={"DUCAT","ASD","LKJH","FJFE","KKR"};
    int image[]={R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,};
    ListView lv;
    ImageView iv;
    TextView tv;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv= (ListView) findViewById(R.id.listView);
        LayoutInflater myinflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE); //to pull service from os
        myducat abc=new myducat();  // myducat returns v so we make object of myducat
        lv.setAdapter(abc); // adapter is set on listview and abc data is passes


    }
    public class myducat extends BaseAdapter{   // baseadapter is used when there are more than one array 

        @Override
        public int getCount() {
            return str.length;
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View View, ViewGroup viewGroup) {  //get view which is given by user
            View v= getLayoutInflater().inflate(R.layout.custom,viewGroup,false);//view is put into view  //always pass false in inflator
            iv= (ImageView) v.findViewById(R.id.imageView);
            tv= (TextView) v.findViewById(R.id.textView);
            rb= (RadioButton) v.findViewById(R.id.radioButton);
            iv.setImageResource(image[i]);  //this method is used to set images  i is passed so that the position is given
            tv.setText(str[i]);
            rb.setText(str1[i]);
            return v;   // layout is in v so v is returned
        }
    }
}
