package com.mycompany.figurasgeometricaspoo;

class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo(double radio, String nombre, String color) {
        super(nombre, color);
        this.radio = radio;
    }//Cierre Constructor

    @Override
    public double obtenerArea() {
        super.obtenerArea();
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }//Cierre obtenerArea

    @Override
    public double obtenerPerimetro() {
        super.obtenerPerimetro();
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }//Cierre obtenerPerimetro

}//Cierre class Circulo
