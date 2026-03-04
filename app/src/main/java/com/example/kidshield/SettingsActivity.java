package com.example.kidshield;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Settings Actions
        findViewById(R.id.setting_child_profiles).setOnClickListener(v -> {
            startActivity(new Intent(this, ChildProfileActivity.class));
        });

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

        findViewById(R.id.nav_alerts).setOnClickListener(v -> {
            startActivity(new Intent(this, AlertsActivity.class));
            finish();
        });

        findViewById(R.id.btn_sign_out).setOnClickListener(v -> {
            startActivity(new Intent(this, ParentLoginActivity.class));
            finishAffinity();
        });
    }
}
