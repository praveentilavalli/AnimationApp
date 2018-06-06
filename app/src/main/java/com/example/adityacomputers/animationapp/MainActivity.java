package com.example.adityacomputers.animationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtview;
    Button btnanimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initilize the resources
        txtview=(TextView)findViewById(R.id.mytext);
        btnanimation=(Button)findViewById(R.id.animationbtn);
        btnanimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim);
                txtview.startAnimation(anim);
            }
        });
    }
}
