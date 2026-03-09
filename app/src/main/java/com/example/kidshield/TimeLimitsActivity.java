package com.example.kidshield;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.slider.Slider;

public class TimeLimitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_limits);

        findViewById(R.id.btn_back).setOnClickListener(v -> finish());

        Slider timeSlider = findViewById(R.id.time_slider);
        TextView tvTimeValue = findViewById(R.id.tv_time_value);

        if (timeSlider != null && tvTimeValue != null) {
            timeSlider.addOnChangeListener((slider, value, fromUser) -> {
                int hours = (int) value;
                tvTimeValue.setText(hours + "h 00m");
            });
        }

        findViewById(R.id.btn_apply_limits).setOnClickListener(v -> {
            startActivity(new Intent(this, AppControlActivity.class));
            finish();
        });
    }
}
