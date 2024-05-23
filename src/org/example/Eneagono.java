package org.example;

public class Eneagono extends FigurasGeometricas {
    double LongitudLado;
    public Eneagono(){

    }
    public Eneagono(String nombre, int Lados,  Double longitudLado){
        super(nombre, Lados);
        this.LongitudLado = longitudLado;
    }


    public Double calcularArea(){
        double areaTriangulo = (LongitudLado * LongitudLado * Math.sqrt(3)) / 4;
        return 9 * areaTriangulo;
    }
}
