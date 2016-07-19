package com.drupalguys.mycamera;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    Button btn, btn1;
    ImageView iv;
    Bitmap bmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv= (ImageView) findViewById(R.id.imageView);
        btn= (Button) findViewById(R.id.button);
        btn1= (Button) findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    getApplicationContext().setWallpaper(bmp);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,70);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent mydata) {
        super.onActivityResult(requestCode, resultCode, mydata);
        if (requestCode==70) {
            Toast.makeText(MainActivity.this,"Setting Wallpaper",Toast.LENGTH_SHORT).show();
            Bundle b= mydata.getExtras();
            bmp= (Bitmap) b.get("data");
            iv.setImageBitmap(bmp);
        }
    }
}
