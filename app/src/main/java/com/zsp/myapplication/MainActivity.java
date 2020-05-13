package com.zsp.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this, MyReactActivity.class);
    }

    public void two(View view) {
        intent.putExtra("bundleName", "index1.android.bundle");
        intent.putExtra("JSMainModulePath", "index1");
        intent.putExtra("moduleName", "MyReactNativeApp");
        startActivity(intent);
    }

    public void one(View view) {
        intent.putExtra("bundleName", "main.jsbundle");
        intent.putExtra("JSMainModulePath", "index");
        intent.putExtra("moduleName", "MyReactNativeApp");
        startActivity(intent);
    }
}
