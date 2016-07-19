package com.travel.shekhar.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RatingBar.OnRatingBarChangeListener {
    RatingBar r;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r= (RatingBar) findViewById(R.id.ratingBar);
        t= (TextView) findViewById(R.id.textView);
        r.setOnRatingBarChangeListener(this);

    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float v, boolean fromUser) {
        t.setText(""+v);

    }
}
