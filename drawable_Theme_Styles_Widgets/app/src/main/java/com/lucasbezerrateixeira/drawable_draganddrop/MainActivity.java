package com.lucasbezerrateixeira.drawable_draganddrop;

import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable wifiAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setBackgroundResource(R.drawable.animation);
        wifiAnimation = (AnimationDrawable) imageView.getBackground();
    }









}
