package com.example.kidshield;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class ParentDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_dashboard);

        // Quick Actions Navigation
        findViewById(R.id.card_location).setOnClickListener(v -> {
            startActivity(new Intent(this, MapActivity.class));
        });

        findViewById(R.id.card_app_controls).setOnClickListener(v -> {
            startActivity(new Intent(this, AppControlActivity.class));
        });

        findViewById(R.id.card_safe_zones).setOnClickListener(v -> {
            startActivity(new Intent(this, SafeZonesActivity.class));
        });

        // Bottom Navigation
        findViewById(R.id.nav_home).setOnClickListener(v -> {
            // Already on Home
        });

        findViewById(R.id.nav_map).setOnClickListener(v -> {
            startActivity(new Intent(this, MapActivity.class));
        });

        findViewById(R.id.nav_controls).setOnClickListener(v -> {
            startActivity(new Intent(this, AppControlActivity.class));
        });

        findViewById(R.id.nav_alerts).setOnClickListener(v -> {
            // startActivity(new Intent(this, AlertsActivity.class)); // Not built yet
        });

        findViewById(R.id.nav_settings).setOnClickListener(v -> {
            // startActivity(new Intent(this, SettingsActivity.class)); // Not built yet
        });
    }
}
