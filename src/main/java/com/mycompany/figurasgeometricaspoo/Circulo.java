package com.mycompany.figurasgeometricaspoo;

class Circulo extends FiguraGeometrica {

    private double radio;

    //Constructor
    //Complejidad temporal: O(1) Tiempo constante.
    public Circulo(double radio, String nombre, String color) {
        super(nombre, color);
        this.radio = radio;
    }//Cierre Constructor

    //Metodo para obtener el area del circulo
    //Complejidad temporal: O(1) Tiempo constante.
    @Override
    public double obtenerArea() {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }//Cierre obtenerArea

    //Metodo para obtener el perimetro del circulo
    //Complejidad temporal: O(1) Tiempo constante.
    @Override
    public double obtenerPerimetro() {
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }//Cierre obtenerPerimetro

}//Cierre class Circulo
