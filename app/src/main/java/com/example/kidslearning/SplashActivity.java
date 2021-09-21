package com.example.kidslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {


    // we declare textview and Relative Layout

    TextView tvKids, tvLearning;
    RelativeLayout relativeLayout;


    Handler handler;


    // Declare Animation class

    Animation txtAnimation, layoutAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Here we find tv and relative layout by id


        txtAnimation = AnimationUtils.loadAnimation(this, R.anim.fall_down);
        layoutAnimation = AnimationUtils.loadAnimation(this, R.anim.bootom_to_top);

        tvKids = findViewById(R.id.tvKids);
        tvLearning = findViewById(R.id.tvLearning);
        relativeLayout = findViewById(R.id.relativeLayout);


        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                relativeLayout.setVisibility(View.VISIBLE);
                relativeLayout.setAnimation(layoutAnimation);

                handler=new Handler();

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tvKids.setVisibility(View.VISIBLE);
                        tvLearning.setVisibility(View.VISIBLE);

                        tvKids.setAnimation(txtAnimation);
                        tvLearning.setAnimation(txtAnimation);
                    }
                },700);


            }
        }, 400);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);



    }
}