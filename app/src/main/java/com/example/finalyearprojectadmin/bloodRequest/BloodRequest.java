package com.example.finalyearprojectadmin.bloodRequest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.finalyearprojectadmin.R;

public class BloodRequest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_request);
        getSupportActionBar().setTitle("Add Request");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.admin_posts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Admin_posts:
                // do something
                Intent changerProfile = new Intent(getApplicationContext(), DeletePosts.class);
                startActivity(changerProfile);
                return true;
            default:
                return super.onContextItemSelected(item);

        }
    }
}
