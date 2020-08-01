package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


/*
         -----------------------java.lang.RuntimeException: Unable to start activity-----------------------

        TextView txtVMsg2 = findViewById(R.id.tvMsg2);
        txtVMsg2.setText(R.string.Msg2);

        app does not start at all
*/


        Log.i("Lifecycle", "OnCreate called...");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("LifeCycle", "OnStart called...");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("LifeCycle", "onResume called...");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("LifeCycle", "onPause called...");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("LifeCycle", "onStop called...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("LifeCycle", "onDestroy called...");
    }
}