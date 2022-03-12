package com.example.sistemasolar;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class adaptadorplaneta extends ArrayAdapter<String> {
        private final Activity context;
        private final String[] nombres;
        private final String[] distancias;
        private final Integer[] fotos;


        public adaptadorplaneta(Activity context, String[] nombres, String[] distancias, Integer[] fotos) {
            super(context,R.layout.items,nombres);
            this.context = context;
            this.nombres = nombres;
            this.distancias = distancias;
            this.fotos = fotos;
        }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.items,null);
        TextView _nombre = (TextView) itemView.findViewById(R.id.nombres);
        TextView _distancias = (TextView) itemView.findViewById(R.id.distancia);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.logo);
        _nombre.setText(nombres[position]);
        _distancias.setText(distancias[position]);
        _imagen.setImageResource(fotos[position]);
        return itemView;
    }

}