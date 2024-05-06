package com.mycompany.figurasgeometricaspoo;

public abstract class FiguraGeometrica {

    private String nombre;
    private String color;
    
    //Constructor
    //Complejidad temporal: O(1) Tiempo constante.
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }//Cierre constructor
    
    //Metodo para cambiar el dato color
    //Complejidad temporal: O(1) Tiempo constante.
    public void setColor(String color) {
        this.color = color;
    }
    
    //Metodo para cambiar el dato nombre
    //Complejidad temporal: O(1) Tiempo constante.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodo para obtener el dato color
    //Complejidad temporal: O(1) Tiempo constante.
    public String getColor() {
        return color;
    }
    
    //Metodo para obtener el dato nombre
    //Complejidad temporal: O(1) Tiempo constante.
    public String getNombre() {
        return nombre;
    }
    
    //Metodo abstracto para acceder a cada clase
    //Complejidad temporal: O(1) Tiempo constante.
    public abstract double obtenerArea();
    
    //Metodo abstracto para acceder a cada clase
    //Complejidad temporal: O(1) Tiempo constante.
    public abstract double obtenerPerimetro();
    

}//Cierre Class Principal
