package com.example.swasthasetu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgetPassword extends AppCompatActivity {
    Button Submit;
    EditText NewPass,ConfirmPass;
    EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        ConfirmPass = findViewById(R.id.ConfirmPass);
        NewPass = findViewById(R.id.NewPass);
        username = findViewById(R.id.username);
Submit=findViewById(R.id.Submit);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (username.getText().toString().equals("user") && NewPass.getText().toString().equals(ConfirmPass.getText().toString())) {

                    Intent intent = new Intent(ForgetPassword.this,MainActivity.class);

                    startActivity(intent);
                    Toast.makeText(ForgetPassword.this, " Password Reset Succesfully", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(ForgetPassword.this, " Password Reset Failed", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}
