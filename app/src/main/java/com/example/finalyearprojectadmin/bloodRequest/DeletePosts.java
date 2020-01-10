package com.example.finalyearprojectadmin.bloodRequest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.finalyearprojectadmin.R;

public class DeletePosts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_posts);
        getSupportActionBar().setTitle("Delete Post");
    }
}
