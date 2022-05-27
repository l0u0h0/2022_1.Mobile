package com.example.bumineun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Crime_search_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crime_search_screen);

        // Search Button
        ImageView search = (ImageView) findViewById(R.id.search_img);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Crime_search_screen.this, Search_empty.class);
                startActivity(intent);
            }
        });

        // Back button
        ImageView back = (ImageView) findViewById(R.id.back_img);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Crime_search_screen.this, Search_main.class);
                startActivity(intent);
            }
        });
    }
}