package com.example.andella;

import android.app.ActionBar;
import android.app.Notification;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar bar=getActionBar();
        //bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0000FF")));

    }
    public void profile(View view){
        Intent intent = new Intent(getApplicationContext(),Profile.class);
        startActivity(intent);
    }
    public void about(View view){
        Intent intent = new Intent(getApplicationContext(),About.class);
        startActivity(intent);
    }


}
