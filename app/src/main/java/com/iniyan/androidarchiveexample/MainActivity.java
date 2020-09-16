package com.iniyan.androidarchiveexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.pt.sdk.Sdk;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // To Test
        Sdk.getInstance().initialize(this);
    }
}