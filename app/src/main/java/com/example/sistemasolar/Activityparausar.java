package com.example.sistemasolar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sistemasolar.databinding.ActivityMainBinding;

public class Activityparausar extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = this.getIntent();

        if (intent != null){

            String name = intent.getStringExtra("name");
            String infor = intent.getStringExtra("infor");
            String caracteristicas = intent.getStringExtra("caracteristicas");
            int imageid = intent.getIntExtra("imageid",R.drawable.marte);

            binding.nameProfile.setText(name);
            binding.infor.setText(infor);
            binding.caracteristicas.setText(caracteristicas);
            binding.profileImage.setImageResource(imageid);


        }

    }
    public void volver (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}
