package com.softwindevs.awesomeslideanimationandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SmoothSlideAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smooth_slide_animation);
    }

    //smooth slide or push current activity toward right
    public void right(View view) {
        startActivity(new Intent(SmoothSlideAnimationActivity.this, DummyActivity.class));
        overridePendingTransition(R.anim.pull_in_right, R.anim.push_from_left);

    }

    //smooth slide or push current activity toward left
    public void left(View view) {
        startActivity(new Intent(SmoothSlideAnimationActivity.this, DummyActivity.class));
       overridePendingTransition(R.anim.pull_in_left, R.anim.push_from_right);

    }

    //smooth slide or push current activity toward bottom
    public void bottom(View view) {
        startActivity(new Intent(SmoothSlideAnimationActivity.this, DummyActivity.class));
        overridePendingTransition(R.anim.pull_in_bottom, R.anim.push_from_top);


    }

    //smooth slide or push current activity toward top
    public void top(View view) {
        startActivity(new Intent(SmoothSlideAnimationActivity.this, DummyActivity.class));
        overridePendingTransition(R.anim.pull_in_top, R.anim.push_from_bottom);
    }

}
