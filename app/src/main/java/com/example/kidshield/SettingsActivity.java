package com.example.kidshield;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Settings Actions
        View childProfiles = findViewById(R.id.setting_child_profiles);
        if (childProfiles != null) {
            childProfiles.setOnClickListener(v -> {
                startActivity(new Intent(this, ChildProfileActivity.class));
            });
        }

        View addDevice = findViewById(R.id.setting_add_device);
        if (addDevice != null) {
            addDevice.setOnClickListener(v -> {
                startActivity(new Intent(this, AddNewDeviceActivity.class));
            });
        }

        View notifications = findViewById(R.id.setting_notifications);
        if (notifications != null) {
            notifications.setOnClickListener(v -> {
                startActivity(new Intent(this, NotificationsActivity.class));
            });
        }

        View helpSupport = findViewById(R.id.setting_help);
        if (helpSupport != null) {
            helpSupport.setOnClickListener(v -> {
                startActivity(new Intent(this, HelpSupportActivity.class));
            });
        }

        // Bottom Navigation
        setupBottomNavigation();

        View signOut = findViewById(R.id.btn_sign_out);
        if (signOut != null) {
            signOut.setOnClickListener(v -> {
                startActivity(new Intent(this, ParentLoginActivity.class));
                finishAffinity();
            });
        }
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
                // Already on Settings
            });
        }
    }
}
