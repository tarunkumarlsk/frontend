package com.example.kidshield;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MyAppsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_apps);

        // Bottom Navigation
        findViewById(R.id.nav_home).setOnClickListener(v -> {
            startActivity(new Intent(this, ChildDashboardActivity.class));
            finish();
        });

        findViewById(R.id.nav_apps).setOnClickListener(v -> {
            // Already on Apps screen
        });

        findViewById(R.id.nav_profile).setOnClickListener(v -> {
            startActivity(new Intent(this, ChildProfileActivity.class));
            finish();
        });
    }
}
