package com.example.finalyearprojectadmin.addDriver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.finalyearprojectadmin.R;

public class AddDriver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_driver);
        getSupportActionBar().setTitle("Add Driver");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.delete_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.change_profile:
                // do something
                Intent changerProfile = new Intent(getApplicationContext(),DeleteDriverDetail.class);
                startActivity(changerProfile);
                return true;
            default:
                return super.onContextItemSelected(item);

        }

    }
}
