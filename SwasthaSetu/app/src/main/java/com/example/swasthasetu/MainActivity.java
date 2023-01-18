package com.example.swasthasetu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtusername, edtpassword;
    Button ForgetPassBtn, EmergencyBtn, NewAc, LoginButton, NearestHospiBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtusername = findViewById(R.id.edtusername);
        edtpassword = findViewById(R.id.edtpassword);
        LoginButton = findViewById(R.id.LoginButton);
        NewAc = findViewById(R.id.NewAc);
        ForgetPassBtn = findViewById(R.id.ForgetPassBtn);
        NearestHospiBtn = findViewById(R.id.NearestHospiBtn);
        EmergencyBtn = findViewById(R.id.EmergencyBtn);



        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtusername.getText().toString().equals("user") && edtpassword.getText().toString().equals("1234")) {

                    Intent intent =new Intent(MainActivity.this,MainPage.class);
                    startActivity(intent);
                Toast.makeText(MainActivity.this, "Login Succesfully", Toast.LENGTH_SHORT).show();


                } else {
                    Toast.makeText(MainActivity.this, "Login failed", Toast.LENGTH_SHORT).show();


                }

            }
        });

        ForgetPassBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent =new Intent(MainActivity.this,ForgetPassword.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "You Forget Your Password", Toast.LENGTH_SHORT).show();


            }
        });

        EmergencyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainActivity.this,EmergencyLogin.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "You Entered In Emeregency Login", Toast.LENGTH_SHORT).show();


            }
        });

        NewAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainActivity.this,Register.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Register As a User ", Toast.LENGTH_SHORT).show();


            }
        });

        NearestHospiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainActivity.this,NearestHospital.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Opened ", Toast.LENGTH_SHORT).show();


            }
        });
    }

}



