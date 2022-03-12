package com.example.sistemasolar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class menu extends AppCompatActivity {
    ImageButton carplanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        carplanetas = findViewById(R.id.carplanetas);

        carplanetas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this,menu_planetas.class);
                startActivity(intent);
            }
        });
    }
}