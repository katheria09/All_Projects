package com.travel.shekhar.progressbar;

import android.app.ProgressDialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    int myprogress;
    long filesize;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final ProgressDialog pd = new ProgressDialog(this);
        pd.setMessage("Please Wait..........");
        pd.setTitle("Downloading");
        pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pd.show();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (myprogress<100)
                {
                    myprogress = DOSOMETASK();
                    try{
                        Thread.sleep(0,100);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }handler.post(new Runnable() {
                    @Override
                    public void run() {
                        pd.setProgressStyle(myprogress);
                    }

                });
            }
        }).start();


    }
    private int DOSOMETASK(){
        while (filesize<=100000)
        {
            filesize++;
            if (filesize<=10000)
            {
                return 10;
            }
            else if (filesize<=20000)
            {
                return 20;
            }
            else if (filesize<=30000)
            {
                return 30;
            }

            else if (filesize<=40000)
            {
                return 40;
            }
            else if (filesize<=50000)
            {
                return 50;
            }
            else if (filesize<=60000)
            {
                return 60;
            }
            else if (filesize<=70000)
            {
                return 70;
            }
            else if (filesize<=80000)
            {
                return 80;
            }
            else if (filesize<=90000)
            {
                return 90;
            }
        }
        return 100;
    }
}
