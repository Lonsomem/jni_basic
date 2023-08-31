package com.example.test_ndk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txt_result;

    static {
        System.loadLibrary("jnitest");
    }

    public native int getSum(int c1, int c2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_result = (TextView) findViewById(R.id.txt_result);

        int c1 = 4;
        int c2 = 2;

        int sum = getSum(c1, c2);
        txt_result.setText("JNI sample :: 합계 : " + sum);

    }
}