package br.com.iterasys;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        chamarCalcAreaQuadrado();
        chamarCalcAreaRetangulo();
        chamarCalcAreaTriangulo();
        chamarCalcAreaCirculo();
    }

    private static void chamarCalcAreaQuadrado() {
        double resulQuadrado = CalcAreaHD.calcAreaQuadrado(5);
        System.out.println("A area do quadrado é " + resulQuadrado);

    }

    private static void chamarCalcAreaRetangulo() {
       double resultRetangulo = CalcAreaHD.calcAreaRetangulo(6,  4);
        System.out.println("A area do retangulo é " + resultRetangulo);
    }

    private static void chamarCalcAreaTriangulo() {
        double resultTriangulo = CalcAreaHD.calcAreaTriangulo(8, 3 / 2);
        System.out.println("A area do triangulo é " + resultTriangulo);
    }

    private static void chamarCalcAreaCirculo() {
        double resultCirculo = CalcAreaHD.calcAreaCirculo(2);
        System.out.println("A area do circulo é " + resultCirculo);
    }

}

