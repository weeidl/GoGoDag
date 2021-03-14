package com.weeidl.gogodag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.weeidl.gogodag.secrettextview.SecretTextView;

import java.util.Timer;
import java.util.TimerTask;

public class AnimationScreen extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;
    SecretTextView go;
    SecretTextView travel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_screen);

        go = findViewById(R.id.textView6);
        travel = findViewById(R.id.textView);
        lottieAnimationView = findViewById(R.id.lottie);

        go.setDuration(1500);
        travel.setDuration(1500);
        go.show();
        travel.show();

//        lottieAnimationView.animate().translationX(-1600).setDuration(200).setStartDelay(1800);
//        imageView.animate().translationX(-1600).setDuration(200).setStartDelay(1800);

        Intent intent = new Intent(this, MainActivity.class);

        Timer mTimer = new Timer();
        mTimer.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                startActivity(intent);
                finish();
            }
        }, 1500);


    }
}