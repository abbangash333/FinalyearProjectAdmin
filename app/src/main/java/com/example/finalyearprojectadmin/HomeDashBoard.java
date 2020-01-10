package com.example.finalyearprojectadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.finalyearprojectadmin.addDriver.AddDriver;

public class HomeDashBoard extends AppCompatActivity {
 private CardView addDriverCardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dash_board);
        getSupportActionBar().setTitle("Admin");
        addDriverCardView = findViewById(R.id.add_driver_card_view);
        addDriverCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AddDriver.class);
                startActivity(intent);
            }
        });

    }
}
