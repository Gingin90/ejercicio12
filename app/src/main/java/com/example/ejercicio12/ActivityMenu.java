package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;

import com.example.ejercicio12.databinding.ActivityMainBinding;
import com.example.ejercicio12.databinding.ActivityMenuBinding;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ActivityMenu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityMenuBinding binding = ActivityMenuBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        List<String> listaMenu = new ArrayList<>();

        listaMenu.add("Puré de calabacín");
        listaMenu.add("Tortilla de patatas");
        listaMenu.add("Albóndigas de pollo");
        listaMenu.add("Ensalada de tomate");
        listaMenu.add("Leche, pan con aceite y fruta");
        listaMenu.add("Lentejas vegetales");
        listaMenu.add("Croquetas de atún");
        listaMenu.add("Menestra de verduras");
        listaMenu.add("Sardinas al horno");
        listaMenu.add("Leche, pan con aceite y fruta");
        listaMenu.add("Macarrones con verduras");
        listaMenu.add("Pollo a la cerveza");
        listaMenu.add("Sopa juliana");
        listaMenu.add("Corvina al ajillo");


        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, listaMenu);
        binding.listView.setAdapter(adapter);
    }
}