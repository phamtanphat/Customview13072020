package com.example.customview13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextViewCircle mTvCircle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvCircle = findViewById(R.id.textViewCircle);
        mTvCircle.setOnClickTitle(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "TextView", Toast.LENGTH_SHORT).show();
            }
        });
    }
}