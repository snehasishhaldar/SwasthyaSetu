package com.example.swasthasetu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class cotactus extends AppCompatActivity {
Button HButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cotactus);
        HButton= findViewById(R.id.HButton);

        HButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(cotactus.this,MainPage.class);
                startActivity(intent);
                Toast.makeText(cotactus.this, "Back To Home", Toast.LENGTH_SHORT).show();


            }
        });

    }
}