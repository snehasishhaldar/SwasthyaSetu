package com.example.swasthasetu;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Prescription extends AppCompatActivity {
ImageButton UploadImageBtn;
Button upload;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prescription);
        UploadImageBtn=  findViewById(R.id.UploadImageBtn);
        upload=findViewById(R.id.upload);


        UploadImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iGallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(iGallery,1);
            }
        });

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(Prescription.this,MainPage.class);
                startActivity(intent);
                Toast.makeText(Prescription.this, "Uploaded Sucessfully", Toast.LENGTH_SHORT).show();


            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==1 && resultCode == RESULT_OK && null != data){
            Uri selectedImage = data.getData();
            String[] filepath = {MediaStore.Images.Media.DATA};

            Cursor cursor = getContentResolver().query(selectedImage,filepath,null,null,null);
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex(filepath[0]);

            String picturePath = cursor.getString(columnIndex);
            cursor.close();

            UploadImageBtn.setImageBitmap(BitmapFactory.decodeFile(picturePath));
        }
    }
}