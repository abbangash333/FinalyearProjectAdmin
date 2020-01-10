package com.example.finalyearprojectadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.finalyearprojectadmin.addDriver.AddDriver;
import com.example.finalyearprojectadmin.bloodRequest.BloodRequest;
import com.example.finalyearprojectadmin.centerData.CenterDataMain;
import com.example.finalyearprojectadmin.missingPersonAdmin.MissingPersonUploadData;

public class HomeDashBoard extends AppCompatActivity {
 private CardView addDriverCardView;
 private CardView bloodRequestCardView;
 private  CardView missingPersonCardView;
 private  CardView changeProfile;
 private  CardView centerDetailCardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dash_board);
        getSupportActionBar().setTitle("Admin");
        addDriverCardView = findViewById(R.id.add_driver_card_view);
        bloodRequestCardView = findViewById(R.id.blood_request_cardView);
        missingPersonCardView = findViewById(R.id.missing_person_cardView);
        changeProfile = findViewById(R.id.change_profile_Center_admin);
        centerDetailCardView = findViewById(R.id.center_detail_cardView);
        addDriverCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AddDriver.class);
                startActivity(intent);
            }
        });
        bloodRequestCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BloodRequest.class);
                startActivity(intent);
            }
        });
        missingPersonCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MissingPersonUploadData.class);
                startActivity(intent);
            }
        });
        changeProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ChangeProfile.class);
                startActivity(intent);
            }
        });
        centerDetailCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), CenterDataMain.class);
                    startActivity(intent);
            }
        });


    }
}
