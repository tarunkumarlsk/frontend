package com.example.kidshield;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ParentLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_login);

        ImageView btnBack = findViewById(R.id.btn_back);
        TextView btnForgotPassword = findViewById(R.id.btn_forgot_password);
        TextView btnCreateAccount = findViewById(R.id.btn_create_account);
        android.widget.Button btnSignIn = findViewById(R.id.btn_sign_in);

        btnBack.setOnClickListener(v -> finish());

        btnSignIn.setOnClickListener(v -> {
            Toast.makeText(this, "Signing in...", Toast.LENGTH_SHORT).show();
            // Navigate to the separate ParentDashboardActivity
            startActivity(new Intent(this, ParentDashboardActivity.class));
            finishAffinity();
        });

        btnForgotPassword.setOnClickListener(v -> {
            startActivity(new Intent(this, ForgotPasswordActivity.class));
        });

        btnCreateAccount.setOnClickListener(v -> {
            startActivity(new Intent(this, CreateAccountActivity.class));
        });
    }
}
