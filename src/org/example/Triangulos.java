package org.example;

public class Triangulos extends FigurasGeometricas {
    double base;
    double altura;
    public Triangulos(double base, double altura) {}
    public Triangulos() {}


    public Triangulos(String nombre, int lados) {
        super(nombre, lados);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calcularArea() {
        return base*altura;
    }
}
