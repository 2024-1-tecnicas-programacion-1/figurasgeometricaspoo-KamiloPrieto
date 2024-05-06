package com.mycompany.figurasgeometricaspoo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido.");
        System.out.println("Ingrese el nombre de la figura");
        String nombreFigura = sc.nextLine();
        System.out.println("Ingrese el color de la figura");
        String colorFigura = sc.nextLine();
        System.out.println("Ingrese el tipo de figura. (1.Circulo, 2.Rectángulo, 3.Triángulo, 4.Salir)");
        int tipo = sc.nextInt();
        switch (tipo) {
            case 1:
                System.out.println("Ha seleccionado Circulo.");
                System.out.println("Ingrese el radio del círculo");
                double radio = sc.nextDouble();

                Circulo circuloUsuario = new Circulo(radio, nombreFigura, colorFigura);

                System.out.println("El valor del area es: " + circuloUsuario.obtenerArea());
                System.out.println("Eñ valor del perimetro es:" + circuloUsuario.obtenerPerimetro());
                break;
            case 2:
                System.out.println("Ha seleccionado Rectangulo.");
                System.out.println("Ingrese el valor del lado 1 del rectángulo.");
                double lado1 = sc.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo.");
                double lado2 = sc.nextDouble();

                Rectangulo rectanguloUsuario = new Rectangulo(lado1, lado2, nombreFigura, colorFigura);
                System.out.println(rectanguloUsuario.obtenerArea());
                break;
            case 3:
                System.out.println("Ha seleccionado Triangulo.");
                System.out.println("Ingrese el valor de la base del triángulo.");
                double base = sc.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo.");
                double altura = sc.nextDouble();

                Triangulo trianguloUsuario = new Triangulo(base, altura, nombreFigura, colorFigura);
                break;

            case 4:
                System.exit(0);
            default:
                System.out.println("Opcion no valida");
                ;
        }
    }//Cierre main
}//Cierre Principal
