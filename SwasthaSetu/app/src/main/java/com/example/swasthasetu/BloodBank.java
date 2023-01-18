package com.example.swasthasetu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BloodBank extends AppCompatActivity {
Button Home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_bank);
        Home = findViewById(R.id.Home);


        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(BloodBank.this, MainPage.class);

                Toast.makeText(BloodBank.this, "Back To Home", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}