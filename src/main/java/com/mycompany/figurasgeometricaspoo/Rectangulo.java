package com.mycompany.figurasgeometricaspoo;

class Rectangulo extends FiguraGeometrica {

    private double lado1;
    private double lado2;
    
    //Constructor
    //Complejidad temporal: O(1) Tiempo constante.
    public Rectangulo(double lado1, double lado2, String nombre, String color) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }//Cierre constructor
    
    //Complejidad temporal: O(1) Tiempo constante.
    public double obtenerArea() {
        double area = lado1 * lado2;
        return area;
    }//Cierre obtenerArea
    
    //Complejidad temporal: O(1) Tiempo constante.
    public double obtenerPerimetro() {
        double perimetro = 2 * lado1 + 2 * lado2;
        return perimetro;

    }//Cierre obtenerPerimetro

}//Cierre Rectangulo
