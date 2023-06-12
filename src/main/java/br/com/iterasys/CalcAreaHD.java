// Pacotes
package br.com.iterasys;
// Bibliotecas


// Classe
public class CalcAreaHD {
    // Atributos
    public static double calcAreaQuadrado(double lado){
        return lado * lado;
    }
    public static double calcAreaRetangulo(double comprimento, double largura){
        return comprimento * largura;
    }
    public static double calcAreaTriangulo(double comprimento, double largura){
        return (comprimento * largura) / 2;
    }
    public static double calcAreaCirculo(double raio){
        return Math.PI * Math.pow(raio, 2);
    }

}
