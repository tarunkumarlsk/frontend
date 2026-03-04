package com.example.kidshield;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class ChildLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_login);

        findViewById(R.id.btn_back).setOnClickListener(v -> finish());

        MaterialButton btnConnect = findViewById(R.id.btn_connect);
        btnConnect.setOnClickListener(v -> {
            Toast.makeText(this, "Device Linked Successfully!", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, ChildDashboardActivity.class));
            finish();
        });
    }
}
