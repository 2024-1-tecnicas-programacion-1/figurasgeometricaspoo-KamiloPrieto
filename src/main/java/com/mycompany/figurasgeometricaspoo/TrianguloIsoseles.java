package com.mycompany.figurasgeometricaspoo;

public class TrianguloIsoseles extends FiguraGeometrica {

    private double lado1;
    private double lado2;
    private double lado3;

    //Constructor
    //Complejidad temporal: O(1) Tiempo constante.
    public TrianguloIsoseles(double lado1, double lado2, double lado3, String nombre, String color) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }//Cierre constructor

    //Metodo para obtener el area del triangulo isoseles
    //Complejidad temporal: O(1) Tiempo constante.
    @Override
    public double obtenerArea() {
        double area = (lado1 * lado2) / 2;
        return area;
    }//Cierre obtenerArea

    //Metodo para obtener el perimetro del triangulo isoseles
    //Complejidad temporal: O(1) Tiempo constante.
    @Override
    public double obtenerPerimetro() {
        double perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }//Cierre obtenerPerimetro

}//CIerre Class
