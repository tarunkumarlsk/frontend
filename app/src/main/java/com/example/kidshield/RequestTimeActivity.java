package com.example.kidshield;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

public class RequestTimeActivity extends AppCompatActivity {

    private MaterialCardView selectedTimeCard;
    private MaterialTextView selectedTimeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_time);

        findViewById(R.id.btn_back).setOnClickListener(v -> finish());

        MaterialCardView btn15m = findViewById(R.id.btn_15m);
        MaterialCardView btn30m = findViewById(R.id.btn_30m);
        MaterialCardView btn1h = findViewById(R.id.btn_1h);

        btn15m.setOnClickListener(v -> selectTime(btn15m, (MaterialTextView) ((MaterialCardView) v).getChildAt(0)));
        btn30m.setOnClickListener(v -> selectTime(btn30m, (MaterialTextView) ((MaterialCardView) v).getChildAt(0)));
        btn1h.setOnClickListener(v -> selectTime(btn1h, (MaterialTextView) ((MaterialCardView) v).getChildAt(0)));

        findViewById(R.id.btn_send).setOnClickListener(v -> {
            startActivity(new Intent(this, RequestSentActivity.class));
            finish();
        });

        // Set initial selection
        selectTime(btn30m, (MaterialTextView) btn30m.getChildAt(0));
    }

    private void selectTime(MaterialCardView card, MaterialTextView text) {
        if (selectedTimeCard != null) {
            selectedTimeCard.setCardBackgroundColor(Color.parseColor("#F9FAFB"));
            selectedTimeText.setTextColor(Color.parseColor("#4B5563"));
        }

        card.setCardBackgroundColor(Color.parseColor("#10B981"));
        text.setTextColor(Color.WHITE);

        selectedTimeCard = card;
        selectedTimeText = text;
    }
}
