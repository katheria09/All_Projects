package com.travel.shekhar.mymedia;

import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    Button btn,btn1;
    MediaPlayer mediaPlayer;
    VideoView vv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        btn1= (Button) findViewById(R.id.button2);
        vv= (VideoView) findViewById(R.id.videoView);
        mediaPlayer= MediaPlayer.create(MainActivity.this,R.raw.audio1);
        vv.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.vid1));
        vv.setMediaController(new MediaController(MainActivity.this));
        vv.start();





        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });
    }
}
