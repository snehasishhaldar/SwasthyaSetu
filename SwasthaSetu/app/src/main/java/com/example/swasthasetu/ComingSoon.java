package com.example.swasthasetu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ComingSoon extends AppCompatActivity {
Button Home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coming_soon);
        Home = findViewById(R.id.Home);


        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ComingSoon.this, MainPage.class);

                Toast.makeText(ComingSoon.this, "Back To Home", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}