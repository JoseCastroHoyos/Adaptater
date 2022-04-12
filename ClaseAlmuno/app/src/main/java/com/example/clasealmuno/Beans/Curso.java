package com.example.clasealmuno.Beans;

public class Curso {
    private String nombrecurso;
    private int Imgencurso;

    public Curso() {
    }

    public Curso(String nombrecurso, int imgencurso) {
        this.nombrecurso = nombrecurso;
        Imgencurso = imgencurso;
    }

    public String getNombrecurso() {
        return nombrecurso;
    }

    public void setNombrecurso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }

    public int getImgencurso() {
        return Imgencurso;
    }

    public void setImgencurso(int imgencurso) {
        Imgencurso = imgencurso;
    }
}
