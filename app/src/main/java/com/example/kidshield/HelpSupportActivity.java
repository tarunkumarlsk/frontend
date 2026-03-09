package com.example.kidshield;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class HelpSupportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_support);

        findViewById(R.id.btn_back).setOnClickListener(v -> finish());

        findViewById(R.id.btn_contact_support).setOnClickListener(v -> {
            Toast.makeText(this, "Connecting to Support...", Toast.LENGTH_SHORT).show();
        });

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
                startActivity(new Intent(this, AppControlActivity.class));
                finish();
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
                finish();
            });
        }
    }
}
