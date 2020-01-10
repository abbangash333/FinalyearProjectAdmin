package com.example.finalyearprojectadmin.missingPersonAdmin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.finalyearprojectadmin.R;

public class DeleteMissingPosts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delet_missing_posts);
        getSupportActionBar().setTitle("Delete Post");
    }
}
