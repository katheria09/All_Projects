package com.drupalguys.notification;

import android.app.NotificationManager;
import android.os.Vibrator;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    NotificationCompat.Builder nn;
    NotificationManager nm;
    Vibrator vi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.button);
        nm= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        vi= (Vibrator) getSystemService(VIBRATOR_SERVICE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nn=new NotificationCompat.Builder(MainActivity.this);
                nn.setContentTitle("You Have New MSG");
                nn.setContentText("hi how are you ?");
                nn.setSmallIcon(R.mipmap.ic_launcher);
                nm.notify(23,nn.build());
                vi.vibrate(2000);




            }
        });
    }
}
