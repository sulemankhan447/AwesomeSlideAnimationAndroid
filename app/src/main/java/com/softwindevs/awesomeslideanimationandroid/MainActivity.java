package com.softwindevs.awesomeslideanimationandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void slide_in_animation_btn(View view) {

         startActivity(new Intent(MainActivity.this, SlideInAnimationActivity.class));

    }

    public void slide_out_animation_btn(View view) {

        startActivity(new Intent(MainActivity.this, SmoothSlideAnimationActivity.class));
    }
}
