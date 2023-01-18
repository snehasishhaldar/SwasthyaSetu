package com.example.swasthasetu;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

public class patientdetails extends AppCompatActivity {
Button btnShare;
View ScrnSht;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientdetails);
        btnShare = findViewById(R.id.btnShare);
        ScrnSht= findViewById(R.id.ScrnSht);

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view ) {
                Bitmap screenshot = ViewShot(ScrnSht);
                View rootView = getWindow().getDecorView().findViewById(android.R.id.content);


                Intent intent =new Intent(Intent.ACTION_SEND);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setType("image/jpeg");
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                screenshot.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
                String path = MediaStore.Images.Media.insertImage(getContentResolver(),screenshot, "Title", null);
                Uri imageUri =  Uri.parse(path);
                intent.putExtra(Intent.EXTRA_STREAM, imageUri);
                startActivity(Intent.createChooser(intent, "Select"));
            }
        });

    }

    public Bitmap ViewShot(View v) {
        int height = v.getHeight();
        int width = v.getWidth();
        Bitmap b = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas (b);
        v.draw(c);
        return b;
    }

}



