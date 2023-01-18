package com.example.swasthasetu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Register extends AppCompatActivity {
Button NewSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        NewSubmit= findViewById(R.id.NewSubmit);


                NewSubmit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent =new Intent(Register.this,MainActivity.class);
                        startActivity(intent);
                        Toast.makeText(Register.this, "Your UserID:-user & Password is 1234", Toast.LENGTH_LONG).show();


                    }
                });
    }

    public static class DonateUS extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }
    }
}
