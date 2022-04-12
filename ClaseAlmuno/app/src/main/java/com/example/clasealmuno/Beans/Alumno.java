package com.example.clasealmuno.Beans;

public class Alumno {
    private String cod,nombrealumno,apellidoalumno;
    private double promedio;

    public Alumno() {
    }

    public Alumno(String cod, String nombrealumno, String apellidoalumno, double promedio) {
        this.cod = cod;
        this.nombrealumno = nombrealumno;
        this.apellidoalumno = apellidoalumno;
        this.promedio = promedio;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNombrealumno() {
        return nombrealumno;
    }

    public void setNombrealumno(String nombrealumno) {
        this.nombrealumno = nombrealumno;
    }

    public String getApellidoalumno() {
        return apellidoalumno;
    }

    public void setApellidoalumno(String apellidoalumno) {
        this.apellidoalumno = apellidoalumno;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
