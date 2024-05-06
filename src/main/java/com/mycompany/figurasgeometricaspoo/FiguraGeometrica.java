package com.mycompany.figurasgeometricaspoo;

public class FiguraGeometrica {

    private String nombre;
    private String color;

    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }//Cierre constructor

    public void setColor(String color) {
        this.color = color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }

    public double obtenerArea() {
        return obtenerArea();
    }//Cierre obtenerArea

    public double obtenerPerimetro() {
        return obtenerArea();
    }//Cierre obtenerPerimetro

}//Cierre Class Principal
