package org.example;

public class CalcAreaGPT {
    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }
    public static double calcularAreaRetangulo(double comprimento, double largura) {
        return comprimento * largura;
    }
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
    public static double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }
    public static void main(String[] args) {
        double ladoQuadrado = 5.0;
        double comprimentoRetangulo = 6.0;
        double larguraRetangulo = 4.0;
        double baseTriangulo = 8.0;
        double alturaTriangulo = 3.0;
        double raioCirculo = 2.5;

        double areaQuadrado = calcularAreaQuadrado(ladoQuadrado);
        double areaRetangulo = calcularAreaRetangulo(comprimentoRetangulo, larguraRetangulo);
        double areaTriangulo = calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
        double areaCirculo = calcularAreaCirculo(raioCirculo);

        System.out.println("Área do Quadrado: " + areaQuadrado);
        System.out.println("Área do Retângulo: " + areaRetangulo);
        System.out.println("Área do Triângulo: " + areaTriangulo);
        System.out.println("Área do Círculo: " + areaCirculo);
    }

}
