package org.example;

public class Cuadrilateros extends FigurasGeometricas {
    double largo;
    double ancho;
    public Cuadrilateros(double largo, double ancho) {}
    public Cuadrilateros() {}


    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularArea() {
        return largo * ancho;
    }
}
