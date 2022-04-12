package com.example.clasealmuno.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.clasealmuno.AlumnoAdapter.CursoAdapter;
import com.example.clasealmuno.Beans.Alumno;
import com.example.clasealmuno.Beans.Curso;
import com.example.clasealmuno.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText txtcod,txtnomb,txtapell,txtnombcur,txtprom;
    private Button btnMostrar;
    private ListView listviewCurso;
    private CursoAdapter cursoAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtcod = findViewById(R.id.txtcod);
        txtnomb = findViewById(R.id.txtnomb);
        txtapell = findViewById(R.id.txtapell);
        txtnombcur = findViewById(R.id.txtnomb);
        txtprom = findViewById(R.id.txtpromedio);
        cursoAdapter = new CursoAdapter(this,ObtenerArreglo());
        listviewCurso = findViewById(R.id.listviewCurso);
        listviewCurso.setAdapter(cursoAdapter);
        btnMostrar = findViewById(R.id.btnmostrar);

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alumno alumno = new Alumno();
                Curso curso = new Curso();
                alumno.setCod(String.valueOf(txtcod.getText()));
                alumno.setNombrealumno(String.valueOf(txtnomb.getText()));
                alumno.setApellidoalumno(String.valueOf(txtapell.getText()));
                alumno.setNombrealumno(String.valueOf(txtnombcur.getText()));
                alumno.setPromedio(Double.parseDouble(txtprom.getText().toString()));
                Mostrar(alumno,curso);
            }
        });


    }
    private ArrayList<Curso> ObtenerArreglo(){
        ArrayList<Curso> cursoArrayList = new ArrayList<>();
        cursoArrayList.add(new Curso("Matematica I", R.drawable.ic_launcher_background));
        cursoArrayList.add(new Curso("Fisica I", R.drawable.ic_launcher_background));
        cursoArrayList.add(new Curso("POO", R.drawable.ic_launcher_background));
        return cursoArrayList;
    }
    public void Mostrar (Alumno alumno,Curso curso){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("cod",alumno.getCod());
        intent.putExtra("nombre",alumno.getNombrealumno());
        intent.putExtra("apellido",alumno.getApellidoalumno());
        intent.putExtra("promedio",alumno.getPromedio());
        startActivity(intent);
    }



}