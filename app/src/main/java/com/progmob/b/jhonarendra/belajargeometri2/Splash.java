package com.progmob.b.jhonarendra.belajargeometri2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
/**
 * Created by Jhonarendra on 5/2/2018.
 */

public class Splash extends AppCompatActivity{

    TextView splashScreenText;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashScreenText = (TextView) findViewById(R.id.splashScreenText);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 2000L);
    }
}
