package com.example.kidslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAlphabetName,btnAnimalName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlphabetName = findViewById(R.id.btnAlphabetName);
        btnAnimalName = findViewById(R.id.btnAnimalName);


        btnAlphabetName.setOnClickListener(new View.OnClickListener() {   // for alphabet letters
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this ,AlphabetActivity.class);
                startActivity(intent);
            }
        });



        btnAnimalName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , AnimalName.class);
                startActivity(intent);
            }
        });

    }
}