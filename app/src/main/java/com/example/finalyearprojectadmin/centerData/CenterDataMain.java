package com.example.finalyearprojectadmin.centerData;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.finalyearprojectadmin.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CenterDataMain extends AppCompatActivity {
    private ActionBar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_center_data_main);
        toolbar = getSupportActionBar();
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        toolbar.setTitle("Persons Detail");
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        Fragment fragment = new PersonsDetailFragment();
        transaction.replace(R.id.bottom_navigation_frame_container,fragment );
        transaction.addToBackStack(null);
        transaction.commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.miising_post_menu:
                    toolbar.setTitle("Person Data");
                    fragment = new PersonsDetailFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.blood_post_menu:
                    toolbar.setTitle("Blood Data");
                    fragment = new BloodDetailFragment();
                    loadFragment(fragment);
                    return true;
            }
            return false;
        }
    };

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.bottom_navigation_frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
