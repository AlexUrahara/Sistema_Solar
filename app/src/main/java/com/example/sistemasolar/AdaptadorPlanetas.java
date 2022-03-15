package com.example.sistemasolar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdaptadorPlanetas extends ArrayAdapter <parausar> {

    public AdaptadorPlanetas(Context context, ArrayList<parausar> parausarArrayList){
        super(context,R.layout.lista_items,parausarArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        parausar parausar = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.lista_items, parent, false);
        }
        ImageView imageView = convertView.findViewById(R.id.planetass);
        TextView nombre = convertView.findViewById(R.id.losplanetas);
        TextView mensaje = convertView.findViewById(R.id.mensaje);
        TextView tipo = convertView.findViewById(R.id.tipo);

        imageView.setImageResource(parausar.imageId);
        nombre.setText(parausar.name);
        mensaje.setText(parausar.lastMessage);
        tipo.setText(parausar.lastMsgType);



        return convertView;
    }
}
