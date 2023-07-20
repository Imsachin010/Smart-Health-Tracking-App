package com.example.checkfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnz, btnz1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnz = findViewById(R.id.button);
        btnz1 = findViewById(R.id.button1);

        btnz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"Showing the results", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, mainactivity2.class));
            }
        });

        btnz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"Showing the results", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Results.class));
            }
        });
    }
}