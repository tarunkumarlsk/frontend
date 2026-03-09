package com.example.kidshield;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class ParentDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_dashboard);

        // Child Profile Navigation
        View cardEmma = findViewById(R.id.card_emma);
        if (cardEmma != null) {
            cardEmma.setOnClickListener(v -> {
                startActivity(new Intent(this, ChildProfileActivity.class));
            });
        }

        // Quick Actions Navigation
        View cardLocation = findViewById(R.id.card_location);
        if (cardLocation != null) {
            cardLocation.setOnClickListener(v -> {
                startActivity(new Intent(this, MapActivity.class));
            });
        }

        View cardAppControls = findViewById(R.id.card_app_controls);
        if (cardAppControls != null) {
            cardAppControls.setOnClickListener(v -> {
                startActivity(new Intent(this, AppControlActivity.class));
            });
        }

        View cardSafeZones = findViewById(R.id.card_safe_zones);
        if (cardSafeZones != null) {
            cardSafeZones.setOnClickListener(v -> {
                startActivity(new Intent(this, SafeZonesActivity.class));
            });
        }

        View cardTimeLimits = findViewById(R.id.card_time_limits);
        if (cardTimeLimits != null) {
            cardTimeLimits.setOnClickListener(v -> {
                startActivity(new Intent(this, TimeLimitsActivity.class));
            });
        }

        // Bottom Navigation
        setupBottomNavigation();
    }

    private void setupBottomNavigation() {
        View home = findViewById(R.id.nav_home);
        if (home != null) {
            home.setOnClickListener(v -> {
                // Already on Home
            });
        }

        View map = findViewById(R.id.nav_map);
        if (map != null) {
            map.setOnClickListener(v -> {
                startActivity(new Intent(this, MapActivity.class));
            });
        }

        View controls = findViewById(R.id.nav_controls);
        if (controls != null) {
            controls.setOnClickListener(v -> {
                startActivity(new Intent(this, AppControlActivity.class));
            });
        }

        View alerts = findViewById(R.id.nav_alerts);
        if (alerts != null) {
            alerts.setOnClickListener(v -> {
                startActivity(new Intent(this, AlertsActivity.class));
            });
        }

        View settings = findViewById(R.id.nav_settings);
        if (settings != null) {
            settings.setOnClickListener(v -> {
                startActivity(new Intent(this, SettingsActivity.class));
            });
        }
    }
}
