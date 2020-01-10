package com.example.finalyearprojectadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ChangeProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_profile);
        getSupportActionBar().setTitle("Change Profile");
    }
}
