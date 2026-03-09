package com.example.kidshield;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AppControlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_controls);

        Button btnSave = findViewById(R.id.btn_save);
        if (btnSave != null) {
            btnSave.setOnClickListener(v -> {
                Toast.makeText(this, "Changes saved successfully", Toast.LENGTH_SHORT).show();
                finish();
            });
        }

        setupBottomNavigation();
    }

    private void setupBottomNavigation() {
        View home = findViewById(R.id.nav_home);
        if (home != null) {
            home.setOnClickListener(v -> {
                startActivity(new Intent(this, ParentDashboardActivity.class));
                finishAffinity();
            });
        }

        View map = findViewById(R.id.nav_map);
        if (map != null) {
            map.setOnClickListener(v -> {
                startActivity(new Intent(this, MapActivity.class));
                finish();
            });
        }

        View controls = findViewById(R.id.nav_controls);
        if (controls != null) {
            controls.setOnClickListener(v -> {
                // Already on Controls
            });
        }

        View alerts = findViewById(R.id.nav_alerts);
        if (alerts != null) {
            alerts.setOnClickListener(v -> {
                startActivity(new Intent(this, AlertsActivity.class));
                finish();
            });
        }

        View settings = findViewById(R.id.nav_settings);
        if (settings != null) {
            settings.setOnClickListener(v -> {
                startActivity(new Intent(this, SettingsActivity.class));
                finish();
            });
        }
    }
}
