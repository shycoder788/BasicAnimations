package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    boolean isCheckedDone = false;
    boolean isSwitchOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LottieAnimationView lottieCheckedDone = findViewById(R.id.lottieCheckedDone);
        lottieCheckedDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isCheckedDone) {
                    lottieCheckedDone.setSpeed(-1);
                    lottieCheckedDone.playAnimation();
                    isCheckedDone = false;
                } else {
                     lottieCheckedDone.setSpeed(1);
                     lottieCheckedDone.playAnimation();
                     isCheckedDone = true;
                }
            }
       });
       final LottieAnimationView lottieSwitchButton = findViewById(R.id.lottieSwitchButton);
       lottieSwitchButton.setSpeed(3f);
        lottieSwitchButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (isSwitchOn) {
                lottieSwitchButton.setMinAndMaxProgress(0.5f , 1.0f);
                lottieSwitchButton.playAnimation();
                isSwitchOn = false;
            } else {
                lottieSwitchButton.setMinAndMaxProgress(0.0f , 0.5f);
                lottieSwitchButton.playAnimation();
                isSwitchOn = true;
            }
        }
    });
    }
}