package com.example.sistemasolar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class menu_planetas extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView) findViewById(R.id.lista_planetas);
        String[] nombres = {"Mercurio","Venus","Tierra","Marte","Jupiter","saturno","Urano","Neptuno"};
        String[] distancias = {"istancia x","distancia x","istancia x","istancia x","istancia x","istancia x","istancia x","istancia x"};
        Integer[] fotos = {R.drawable.tierra1,R.drawable.tierra1,R.drawable.tierra1,R.drawable.tierra1,R.drawable.tierra1};
        adaptadorplaneta adaptador = new adaptadorplaneta(this,nombres,distancias,fotos);
        listView.setAdapter(adaptador);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Seleccionaste : "+nombres[i],Toast.LENGTH_LONG).show();
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"El costo es : "+distancias[i],Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }
}