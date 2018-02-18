package com.example.marissagift.nyimas_1202154354_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIMEOUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(SplashScreen.this, MenuUtama.class);
                startActivity(homeIntent);
                finish();
            }
        }, SPLASH_TIMEOUT);

        Intent intent = new Intent(this, SplashScreen.class);
        Toast.makeText(SplashScreen.this, "Nyimas Marissa Gita Fitri_1202154354", Toast.LENGTH_SHORT).show();
    }
}
