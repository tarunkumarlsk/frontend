package com.example.kidshield;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class AlertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerts);

        // Bottom Navigation
        findViewById(R.id.nav_home).setOnClickListener(v -> {
            startActivity(new Intent(this, ParentDashboardActivity.class));
            finishAffinity();
        });

        findViewById(R.id.nav_map).setOnClickListener(v -> {
            startActivity(new Intent(this, MapActivity.class));
            finish();
        });

        findViewById(R.id.nav_controls).setOnClickListener(v -> {
            startActivity(new Intent(this, AppControlActivity.class));
            finish();
        });

        findViewById(R.id.nav_settings).setOnClickListener(v -> {
            startActivity(new Intent(this, SettingsActivity.class));
            finish();
        });
    }
}
