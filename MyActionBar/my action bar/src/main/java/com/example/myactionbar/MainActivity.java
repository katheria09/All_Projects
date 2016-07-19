package com.example.myactionbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar supportActionBar = getSupportActionBar();
//        supportActionBar.show();
        supportActionBar.setLogo(R.drawable.logo);
//        supportActionBar.hide();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items
        // to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        CharSequence message = "Nothing selected";
        int id = item.getItemId();
        switch (id){
            case R.id.action_settings:
                message = "Menu item Settings selected";
                break;
            case R.id.action_phone:
                message = "Menu item Phone selected";
                Intent intent = new Intent(this,SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.action_help:
                message = "Menu item Help selected";
                break;
        }
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}
