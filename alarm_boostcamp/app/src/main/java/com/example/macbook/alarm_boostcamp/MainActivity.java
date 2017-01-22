package com.example.macbook.alarm_boostcamp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imgView = (ImageView) findViewById(R.id.iv_piccaso);
                Picasso.with(this)
                .load("https://www.google.co.kr/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png")
                .into(imgView);
    }
}
