package com.example.sistemasolar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;


import com.example.sistemasolar.databinding.ActivityMainBinding;
import com.example.sistemasolar.databinding.ActivityMenuPlanetasBinding;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMenuPlanetasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuPlanetasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.mercurio, R.drawable.venus, R.drawable.tierra1, R.drawable.marte,
                R.drawable.jupiter, R.drawable.saturno, R.drawable.urano, R.drawable.neptuno };
        String[] name={" Mercurio", " Venus", " Tierra", " Marte", " Jupiter", " Saturno", " Urano", " Neptuno"};
        String[] lastMessage={
                "El cuerpo del planeta es rocoso y se caracteriza por la presencia de cráteres, resultado de los múltiples impactos de cuerpos celestes de menor tamaño. ",
                "Venus es un planeta rocoso con un tamaño y composición similar a la Tierra, a excepción de su atmósfera, compuesta por gases tóxicos. Por otra parte, su núcleo es de níquel y hierro.",
                "La Tierra es el tercer planeta orbitando alrededor del Sol. Su composición terrestre, la presencia de agua y una atmósfera compuesta por oxígeno, nitrógeno y vapor de agua, hicieron posible que se generaran las condiciones para la vida.",
                "Marte es el cuarto planeta orbitando alrededor del Sol. Es conocido también como “el planeta rojo” debido al color de su superficie",
                "Es el planeta más grande del sistema solar y el segundo cuerpo celeste más grande del sistema, después del Sol",
                "Conocido por los siete anillos que lo rodean, Saturno también se caracteriza por la presencia de polos achatados producidos por su baja gravedad y rápido movimiento de rotación.",
                "Urano es un planeta gaseoso compuesto por gas metano en mayor proporción, seguido de hidrógeno y helio.",
                "Es el planeta más lejano del sistema solar y el cuarto con respecto a su tamaño. Junto a Júpiter y Urano conforman el grupo de planetas gaseosos."};


        String[] lastTime={" Tipo Rocoso", " Tipo Rocoso", " Tipo Rocoso", "Tipo Rocoso", " Tipo Gaseoso", " Tipo Gaseoso", " Tipo Gaseoso", " Tipo Gaseoso"};

        String[] infor={
                "Se conoce como el “planeta de hierro” debido a que su composición es rica en este elemento químico en al menos un 70%. El porcentaje restante corresponde a elementos como helio, calcio,sodio, oxígeno y magnesio.\n" + "\n" + "El cuerpo del planeta es rocoso y se caracteriza por la presencia de cráteres, resultado de los múltiples impactos de cuerpos celestes de menor tamaño.",
                "Venus es un planeta rocoso con un tamaño y composición similar a la Tierra, a excepción de su atmósfera, compuesta por gases tóxicos. Por otra parte, su núcleo es de níquel y hierro.\n" + "\n" + "El planeta Venus carece de agua, pero estudios realizados por la NASA y divulgados en 2019 concluyeron que hasta hace 700 millones de años sí tuvo agua y una atmósfera estable con condiciones para el desarrollo de vida orgánica.\n" + "\n" + "Debido a estas condiciones, Venus es un planeta candidato para la terraformación. Se trata de un proceso teórico de creación de condiciones óptimas para la vida, generadas con complejos sistemas de ingeniería.",
                "La Tierra es el tercer planeta orbitando alrededor del Sol. Su composición terrestre, la presencia de agua y una atmósfera compuesta por oxígeno, nitrógeno y vapor de agua (entre otros componentes), hicieron posible que se generaran las condiciones para la vida.\n" + "\n" + "Otra características del planeta Tierra es la existencia de una capa de ozono que protege a todas las formas de vida de la radiación solar. Esto, y la presencia de grandes masas de agua en estado líquido que conforman un 70% de la composición del planeta, hacen de la Tierra el único planeta habitable, hasta ahora.\n" + "\n" + "Por otra parte, la Tierra cuenta con su propio satélite natural, la Luna.",

                "Marte es el cuarto planeta orbitando alrededor del Sol. Es conocido también como “el planeta rojo” debido al color de su superficie, originado por la presencia de óxido de hierro. Su atmósfera es de dióxido de carbono y tiene dos satélites naturales: Fobos y Deimos.\n" + "\n" + "Aunque durante mucho tiempo Marte fue considerado un lugar inhabitable,esa percepción ha cambiado en las últimas décadas, debido a las pruebas que sugieren la presencia de grandes masas de agua congelada bajo su superficie.\n" + "\n" + "Marte es, junto con Venus, el otro planeta considerado para la terraformación, es decir, para la creación de condiciones que permitan la vida.",
                "Es el planeta más grande del sistema solar y el segundo cuerpo celeste más grande del sistema, después del Sol. Júpiter tiene una composición gaseosa en la que el hidrógeno y el helio son los componentes principales.\n" + "\n" + "En su estructura interna, se especula que Júpiter contiene hidrógeno en estado líquido y un núcleo rocoso.",
                "Conocido por los siete anillos que lo rodean, Saturno también se caracteriza por la presencia de polos achatados producidos por su baja gravedad y rápido movimiento de rotación.\n" + "\n" + "La atmósfera de Saturno está compuesta por un 96% de hidrógeno, mientras que el porcentaje restante es helio. Se especula que en su composición interna hay material rocoso cubierto por una capa de hidrógeno líquido.\n" + "\n" + "Como dato curioso, la temperatura de Saturno duplica a del Sol, llegando a los 11726.85 °C; mientras que la temperatura del Sol es de 5505 °C.",
                "Urano es un planeta gaseoso compuesto por gas metano en mayor proporción, seguido de hidrógeno y helio. Es el tercer planeta en cuanto a tamaño y el séptimo con respecto a su órbita del Sol.\n" + "\n" + "Urano tiene una temperatura de -224 °C, lo cual lo convierte en el planeta con la atmósfera más fría del sistema solar. Además, tiene una serie de anillos que lo rodean pero a diferencia de Saturno, no son tan visibles y se ven como si estuviesen orbitando al planeta de manera vertical.\n" + "\n" + "Sin embargo, esta configuración de los anillos de Urano se trata de un efecto generado por su inclinación, que hace que sus polos se vean en el lugar que le corresponde al ecuador.",
                "Es el planeta más lejano del sistema solar y el cuarto con respecto a su tamaño. Junto a Júpiter y Urano conforman el grupo de planetas gaseosos, ya que su atmósfera se compone principalmente de hidrógeno, helio y rastros de hidrocarburos. Su color azul característico de se debe al metano, mientras que su interior es rocoso y helado.\n" + "\n" + "Aunque es un planeta con temperaturas muy bajas (-218°C), se plantea la existencia de una fuente interna de energía que hace que Urano genere calor."};

        String[] caracteristicas={"Masa: 3,302×1023 kg\n\n" + "Movimiento de rotación: 58,7 días\n\n " + "Movimiento de traslació: 88 días\n\n" + "Gravedad: 3,7 m/s²",
        "Masa: 4,87 x 1024kg.\n\n" + "Movimiento de rotación: 243  días\n\n " + "Movimiento de traslació: 225 días\n\n" + "Gravedad: 8,87 m/s²",
        "Masa: 5,97 x 1024kg.\n\n" + "Movimiento de rotación: 24 horas.\n\n " + "Movimiento de traslació: 365 días\n\n" + "Gravedad: 8,87  m/s²",
        "Masa: 0,642 x 1024kg.\n\n" + "Movimiento de rotación: 1,30 días.\n\n " + "Movimiento de traslació: 687 días\n\n" + "Gravedad: 3,711 m/s²",
        "Masa: 1,899×1027 kg.\n\n" + "Movimiento de rotación: 9 h, 50 min.\n\n " + "Movimiento de traslació: 4329 días\n\n" + "Gravedad: 24.79 m/s²",
        "Masa: 5,688·1026 kg.\n\n" + "Movimiento de rotación: 10h, 40 min.\n\n " + "Movimiento de traslació: 10768 días\n\n" + "Gravedad: 10,44  m/s²",
        "Masa: 5,688·1026 kg.\n\n" + "Movimiento de rotación: 17h, 14min.\n\n " + "Movimiento de traslació: 30685  días\n\n" + "Gravedad: 8,69 m/s²",
        "Masa: 1,024×1026 kg.\n\n" + "Movimiento de rotación: 16h, 6min, 14s\n\n " + "Movimiento de traslació: 60225 días\n\n" + "Gravedad: 11,15  m/s²",
        };

        ArrayList<parausar> parausarArrayList = new ArrayList<>();

          for (int i = 0;i< imageId.length;i++){

              parausar parausar = new parausar(name[i],lastMessage[i],lastTime[i],infor[i],caracteristicas[i],imageId[i]);
              parausarArrayList.add(parausar);
          }

          AdaptadorPlanetas adaptadorPlanetas =new AdaptadorPlanetas(MainActivity.this, parausarArrayList);

          binding.listaplanetas.setAdapter(adaptadorPlanetas);
        binding.listaplanetas.setClickable(true);
        binding.listaplanetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(MainActivity.this,Activityparausar.class);
                i.putExtra("name",name[position]);
                i.putExtra("infor",infor[position]);
                i.putExtra("caracteristicas",caracteristicas[position]);
                i.putExtra("imageid",imageId[position]);
                startActivity(i);

            }
        });


    }
    public void volver (View view){
        Intent i = new Intent(this, Activityparausar.class);
        startActivity(i);
    }

}