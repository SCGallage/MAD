package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Lifecycle", "OnCreate() invoked");

        textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(R.string.Msg2);

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Lifecycle", "OnCreate() invoked");
    }

    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle", "OnCreate() invoked");
    }

    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle", "OnCreate() invoked");
    }

}