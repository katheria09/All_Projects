package com.shekhar.local;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton i1;
    ImageButton i2;
    SearchView s1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       i1= (ImageButton) findViewById(R.id.ImageButton1);
       i1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(v.getContext(),Men.class);
               startActivity(intent);
           }
       });
       i2= (ImageButton) findViewById(R.id.ImageButton2);
       i2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(v.getContext(),Women.class);
               startActivity(intent);
           }
       });
    }

    @Override
    public void onClick(View v) {

    }


    /*public void switchFragment (int page)
    {
        MyFragment fragment=new MyFragment();
        Bundle b = new Bundle();
        b.putInt("page",page);
        Fragment.setArgument(b);
        FragmentTransaction ft = this.getFragmentManager().beginTransaction();
        ft.replace(R.id.fragmentcontainer,fragment);
        }*/
}
