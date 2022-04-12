package com.example.clasealmuno.AlumnoAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.clasealmuno.Beans.Alumno;
import com.example.clasealmuno.Beans.Curso;
import com.example.clasealmuno.R;

import java.util.ArrayList;

public class CursoAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Curso> cursoArrayList;

    public CursoAdapter(Context context, ArrayList<Curso> cursoArrayList) {
        this.context = context;
        this.cursoArrayList = cursoArrayList;
    }

    @Override
    public int getCount() {
        return cursoArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return cursoArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        Curso item_curso = (Curso) getItem(position);
        convertView = LayoutInflater.from(context).inflate(R.layout.item_curso, null);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);

        TextView etNombreCurso = (TextView) convertView.findViewById(R.id.textView);
        imageView.setImageResource(item_curso.getImgencurso());
        etNombreCurso.setText(item_curso.getNombrecurso());
        return convertView;
    }
}
