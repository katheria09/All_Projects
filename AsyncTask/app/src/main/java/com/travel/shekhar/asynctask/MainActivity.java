package com.travel.shekhar.asynctask;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tv;
    ProgressDialog pd;
    int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.button);
        tv= (TextView) findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new myAsyncTask().execute();
            }
        });
    }
    public class myAsyncTask extends AsyncTask<String,String,String>
    {

        @Override
        protected String doInBackground(String... params) {
            for (i=0;i<900000;i++)
            {

            }
            return null;

        }

        @Override
        protected void onPreExecute() {
            pd=new ProgressDialog(MainActivity.this);
            pd.setMessage("Please wait........");
            pd.show();
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(String s) {
            pd.dismiss();
            tv.setText("My Count is " +i);
            super.onPostExecute(s);
        }
    }
}
