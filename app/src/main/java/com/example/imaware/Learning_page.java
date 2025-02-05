package com.example.imaware;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class Learning_page extends AppCompatActivity {
    TextView welcome,begin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_page);
        welcome=findViewById(R.id.welcm);
        begin=findViewById(R.id.bign);
        welcome.setVisibility(View.VISIBLE);
        begin.setVisibility(View.INVISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                welcome.setVisibility(View.INVISIBLE);
                begin.setVisibility(View.VISIBLE);

            }
        },2000);

    }
}