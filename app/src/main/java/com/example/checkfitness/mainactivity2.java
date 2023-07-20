package com.example.checkfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class mainactivity2 extends AppCompatActivity {

    EditText edSleep_Hours;
    Button btn, btn2, btn3, btn1, btnokHr;
    TextView tv,txtSleepHr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity2);

        btn = findViewById(R.id.spo2);
        btn1 = findViewById(R.id.heartrate);
        btn2 = findViewById(R.id.temperature);
        btn3 = findViewById(R.id.movement);
        edSleep_Hours = findViewById(R.id.edSleep_Hours);
        txtSleepHr = findViewById(R.id.txtSleepHr);
        btnokHr = findViewById(R.id.okHr);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"Showing the results", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(mainactivity2.this, spO2.class));
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"Showing the results", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(mainactivity2.this, heartrate.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"Showing the results", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(mainactivity2.this, temperature.class));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"Showing the results", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(mainactivity2.this, movement.class));
            }
        });

        btnokHr.setOnClickListener(v -> {
            String SleepHr = edSleep_Hours.getText().toString();
            txtSleepHr.setText(SleepHr+" hours");
        });
    }
}