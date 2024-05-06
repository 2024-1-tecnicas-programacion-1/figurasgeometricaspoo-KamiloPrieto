package com.mycompany.figurasgeometricaspoo;

class Rectangulo extends FiguraGeometrica {

    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2, String nombre, String color) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }//Cierre constructor

    public double obtenerArea() {
        super.obtenerArea();
        double area = lado1 * lado2;
        return area;
    }//Cierre obtenerArea

    public double obtenerPerimetro() {
        super.obtenerPerimetro();
        double perimetro = 2 * lado1 + 2 * lado2;
        return perimetro;

    }//Cierre obtenerPerimetro

}//Cierre Rectangulo
