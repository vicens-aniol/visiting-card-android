package com.community.jboss.visitingcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.community.jboss.visitingcard.IntroScreens.SliderActivity;
import com.community.jboss.visitingcard.R;


public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        SplashLauncher splashLauncher = new SplashLauncher();
        splashLauncher.start();
    }

    private class SplashLauncher extends Thread {
        public void run(){
            try{
                setContentView(R.layout.activity_splash_screen);
                sleep(5000);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }

            Intent intent = new Intent(SplashScreen.this, SliderActivity.class);
            startActivity(intent);
            SplashScreen.this.finish();
        }
    }
}

