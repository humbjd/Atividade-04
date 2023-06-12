package br.com.iterasys;

public class DDCalcAreaHD{

    public static double calcAreaQuadradoDD(double lado){
        double calcQuadrado = lado * lado;
        return calcQuadrado;
    }
    public static double calcAreaRetanguloDD(double comprimento, double largura){
        double calcRetangulo = comprimento * largura;
        return calcRetangulo;
    }
    public static double calcAreaTrianguloDD(double comprimento, double largura){
        double calcTriangulo = (comprimento * largura) / 2;
        return calcTriangulo;
    }
    public static double calcAreaCirculoDD(double raio){
        double calcCirculo = (Math.PI * Math.pow(raio, 2));
        return calcCirculo;
    }

}

