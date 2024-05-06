package com.mycompany.figurasgeometricaspoo;

class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public Triangulo(double base, double altura, String nombre, String color) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }//Cierre constuctor

    public double obtenerArea() {
        super.obtenerArea();
        double area = (base * altura) / 2;
        return area;
    }//Cierre obtenerArea

    public double obtenerPerimetro() {
        super.obtenerPerimetro();
        double hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        double perimetro = base + altura + hipotenusa;
        return perimetro;
    }//Cierre obtenerPerimetro
}//Cierre clase Triangulo
