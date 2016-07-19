package com.travel.shekhar.wallpaper;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {
    int i;
    Timer mutimer;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bmp=findViewById(R.id.)
        new myAsyncTask().execute();
    }

    public class myAsyncTask extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {

            for (i=0;i<100000;i++)
            {

            }
            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            try {
                getApplicationContext().setWallpaper(bmp);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}