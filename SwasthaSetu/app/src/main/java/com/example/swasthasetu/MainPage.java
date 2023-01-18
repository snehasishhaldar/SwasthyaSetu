package com.example.swasthasetu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainPage extends AppCompatActivity {
    ImageButton PatientBtn,MedicalButton,UploadPrescription,labreport,hospitaldtl,bloodbank,ContactUs,donateus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        PatientBtn = findViewById(R.id.PatientBtn);
        MedicalButton= findViewById(R.id.MedicalButton);
        UploadPrescription=findViewById(R.id.UploadPrescription);
        labreport=findViewById(R.id.labreport);
        hospitaldtl=findViewById(R.id.hospitaldtl);
        bloodbank=findViewById(R.id.bloodbank);
        ContactUs=findViewById(R.id.ContactUs);
        donateus=findViewById(R.id.donateus);

        PatientBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainPage.this,patientdetails.class);
                startActivity(intent);
                Toast.makeText(MainPage.this, "Your Patient Details Opened", Toast.LENGTH_SHORT).show();


            }
        });

        MedicalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainPage.this,MedicineDetails.class);
                startActivity(intent);
                Toast.makeText(MainPage.this, "Medical Details Opened", Toast.LENGTH_SHORT).show();


            }
        });

        UploadPrescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainPage.this,Prescription.class);
                startActivity(intent);


            }
        });

        labreport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainPage.this,ComingSoon.class);
                startActivity(intent);
                Toast.makeText(MainPage.this, "We are Working On this Freature", Toast.LENGTH_SHORT).show();


            }
        });
        hospitaldtl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainPage.this,ComingSoon.class);
                startActivity(intent);
                Toast.makeText(MainPage.this, "We are Working On this Freature", Toast.LENGTH_SHORT).show();


            }
        });

        bloodbank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainPage.this,BloodBank.class);
                startActivity(intent);
                Toast.makeText(MainPage.this, "Blood Bank", Toast.LENGTH_SHORT).show();


            }
        });
        ContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainPage.this,cotactus.class);
                startActivity(intent);
                Toast.makeText(MainPage.this, "Contact Us", Toast.LENGTH_SHORT).show();


            }
        });
        donateus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainPage.this, donateussomeplease.class);
                startActivity(intent);
                Toast.makeText(MainPage.this, "Donate Us", Toast.LENGTH_SHORT).show();


            }
        });


    }
}