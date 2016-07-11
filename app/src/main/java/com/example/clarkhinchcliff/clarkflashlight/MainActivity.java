package com.example.clarkhinchcliff.clarkflashlight;

import android.graphics.Camera;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

import java.security.Policy;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnSwitch;
    private Camera camera;
    private boolean isFlashOn;
    private boolean hasFlash;
    private Policy.Parameters params;
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        btnSwitch = (ImageButton) findViewById(R.id.btnSwitch);
    }
}
