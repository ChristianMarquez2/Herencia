package org.example;

public class Circulos extends FigurasGeometricas {
    double radio;
    public Circulos (double radio){}
    public Circulos(){}

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double CalcularArea(){
        return Math.PI * radio * radio;
    }

}
