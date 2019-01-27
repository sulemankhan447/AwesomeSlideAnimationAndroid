package com.softwindevs.awesomeslideanimationandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SlideInAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_in_animation);

    }

    //slide in from right & fade out current activtiy
    public void right(View view) {
        startActivity(new Intent(SlideInAnimationActivity.this, DummyActivity.class));
        overridePendingTransition(R.anim.screen_slide_in_from_right, R.anim.fade_out);
    }

    //slide in from left & fade out current activtiy
    public void left(View view) {
        startActivity(new Intent(SlideInAnimationActivity.this, DummyActivity.class));
        overridePendingTransition(R.anim.screen_slide_in_from_left, R.anim.fade_out);
    }

    //slide in from bottom & fade out current activtiy
    public void bottom(View view) {
        startActivity(new Intent(SlideInAnimationActivity.this, DummyActivity.class));
        overridePendingTransition(R.anim.screen_slide_in_from_bottom, R.anim.fade_out);
    }

    //slide in from top & fade out current activtiy
    public void top(View view) {
        startActivity(new Intent(SlideInAnimationActivity.this, DummyActivity.class));
        overridePendingTransition(R.anim.screen_slide_in_from_top, R.anim.fade_out);
    }

    //slide in from center zoom & fade out current activtiy
    public void center(View view) {
        startActivity(new Intent(SlideInAnimationActivity.this, DummyActivity.class));
        overridePendingTransition(R.anim.center_zoom_in_fade_in, R.anim.fade_out);
    }

    //slide in from fade in & fade out current activtiy
    public void fadein(View view) {
        startActivity(new Intent(SlideInAnimationActivity.this, DummyActivity.class));
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

    }


}
