package com.example.swasthasetu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class NearestHospital extends AppCompatActivity {
ImageButton callhospital;
        EditText callnumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearest_hospital);
        callhospital= findViewById(R.id.callhospital);
                callnumber=findViewById(R.id.callnumber);


    callhospital.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String phone = callnumber.getText().toString();
String s = "tel:" + callnumber;
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse(s));
            startActivity(intent);
        }

    });

    }
}