package com.example.clasealmuno.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.clasealmuno.R;

import java.util.ArrayList;


public class MainActivity2 extends AppCompatActivity {
    private ListView listresul;
    private ArrayAdapter arrayAdapter;
    private ArrayList<String> resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listresul =(ListView) findViewById(R.id.listRes);
        resultado = new ArrayList<>();
        resultado.add("Codigo de Alumno es : "+ getIntent().getSerializableExtra("cod"));
        resultado.add("Nombre de Alumno es : "+ getIntent().getSerializableExtra("nombre"));
        resultado.add("Apellido de Alumno es : "+ getIntent().getSerializableExtra("apellido"));
        resultado.add("Curso Elegido es : "+ getIntent().getSerializableExtra("nombrecurso"));
        resultado.add("El Promedio es : "+ getIntent().getSerializableExtra("promedio"));
        arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, resultado);
        listresul.setAdapter(arrayAdapter);

    }
}