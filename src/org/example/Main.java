package org.example;

public class Main {
    public static void main(String[] args) {

        FigurasGeometricas miFiguras = new FigurasGeometricas();
        Circulos miFigura2 = new Circulos();
        Triangulos miFigura3 = new Triangulos();
        Cuadrilateros miFigura4 = new Cuadrilateros(); //Estoy creando constructores

        Circulos miFigura5 = new Circulos(3.00);
        Triangulos miFigura6 = new Triangulos( 6.00, 8.00);
        Cuadrilateros miFigura7 = new Cuadrilateros(5.00, 5.00);
        Cuadrilateros miFigura8 = new Cuadrilateros(5.00, 10.00);


        miFigura2.setNombre("Pileta del CEC");//tengo los elementos de la clase circulo y de la clase padre
        System.out.println(miFigura2.getNombre());

        //Puedo empezar a crear los metodos de los objetos creados
        System.out.println("La nueva pileta tendrá un radio de: ");
        miFigura2.setRadio(4.00);
        System.out.println(miFigura2.getRadio());

        System.out.println("y su Área será: ");
        System.out.println(miFigura2.CalcularArea());


        miFigura3.setBase(2.0);
        miFigura3.setAltura(4.0);
        System.out.println("El area del triangulo 3 es:");
        System.out.println(miFigura3.calcularArea());

        miFigura4.setAncho(5.0);
        miFigura4.setLargo(7.0);
        System.out.println("El area de la figura 4 es:");
        System.out.println(miFigura4.calcularArea());

        System.out.println("El area de la figura 5 es:");
        System.out.println(miFigura5.CalcularArea());

        System.out.println("El area de la figura 6 es:");
        System.out.println(miFigura6.calcularArea());

        System.out.println("El area de la figura 7 es:");
        System.out.println(miFigura7.calcularArea());

        System.out.println("El area de la figura 8 es:");
        System.out.println(miFigura8.calcularArea());

        Eneagono minueve = new Eneagono();
        System.out.println("El area del eneagono es:");
        System.out.println(minueve.calcularArea());
        }
    }
