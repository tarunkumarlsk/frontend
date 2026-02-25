package com.example.kidshield;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        ImageView btnBack = findViewById(R.id.btn_back);
        TextView btnLogin = findViewById(R.id.btn_login);
        android.widget.Button btnCreate = findViewById(R.id.btn_create);

        btnBack.setOnClickListener(v -> finish());
        btnLogin.setOnClickListener(v -> finish());

        btnCreate.setOnClickListener(v -> {
            Toast.makeText(this, "Account created successfully", Toast.LENGTH_LONG).show();
            finish();
        });
    }
}
