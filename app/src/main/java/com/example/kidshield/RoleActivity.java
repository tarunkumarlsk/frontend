package com.example.kidshield;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.card.MaterialCardView;

public class RoleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role);

        MaterialCardView cardParent = findViewById(R.id.card_parent);
        MaterialCardView cardChild = findViewById(R.id.card_child);

        // Navigate to Parent Login screen
        cardParent.setOnClickListener(v -> {
            Intent intent = new Intent(RoleActivity.this, ParentLoginActivity.class);
            startActivity(intent);
        });

        // Navigate to Child Login screen
        cardChild.setOnClickListener(v -> {
            Intent intent = new Intent(RoleActivity.this, ChildLoginActivity.class);
            startActivity(intent);
        });
    }
}
