package com.example.kidshield;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ChildDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_dashboard);

        // SOS Button
        findViewById(R.id.btn_sos).setOnClickListener(v -> {
            startActivity(new Intent(this, SOSActivity.class));
        });

        // Quick Actions
        findViewById(R.id.card_request_time).setOnClickListener(v -> {
            startActivity(new Intent(this, RequestTimeActivity.class));
        });

        findViewById(R.id.card_my_apps).setOnClickListener(v -> {
            startActivity(new Intent(this, MyAppsActivity.class));
        });

        // Bottom Navigation
        findViewById(R.id.nav_home).setOnClickListener(v -> {
            // Already on home
        });

        findViewById(R.id.nav_apps).setOnClickListener(v -> {
             startActivity(new Intent(this, MyAppsActivity.class));
             finish();
        });

        findViewById(R.id.nav_profile).setOnClickListener(v -> {
            startActivity(new Intent(this, ChildProfileActivity.class));
        });
    }
}
