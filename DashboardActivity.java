package com.sandeepkambojiftmu.hubcoretrofitapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    TextView username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        Intent intent =getIntent();
        if(intent.getExtras() !=null){
            String passedUsername = intent.getStringExtra("data");

        }
    }
}