package com.example.dannyseo.hanpost;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FullImage extends AppCompatActivity {


    ImageView fullImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        fullImage = findViewById(R.id.full_image);

        String data = getIntent().getExtras().getString("img");

        fullImage.setImageURI(Uri.parse(data));
    }
}
