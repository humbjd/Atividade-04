package br.com.iterasys;// Pacotes
import org.testng.Assert;
import org.testng.annotations.Test;

import static br.com.iterasys.CalcAreaGPT.calcularAreaCirculo;
import static br.com.iterasys.CalcAreaHD.calcAreaQuadrado;
import static br.com.iterasys.CalcAreaHD.calcAreaRetangulo;


//Bibliotecas


// Classes
public class TestCalcAreaHD {
    @Test
    public void testCalcAreaQuadrado(){
    // Configura
        double lado = 5;
        double resultEsperado = 25;

    // Executa
        double resultAtual = calcAreaQuadrado(lado);

    // Valida
        Assert.assertEquals(resultAtual, resultEsperado);
    }

    @Test
    public void testCalcAreaRetangulo(){
        // Configura
        double comprimento = 6;
        double largura = 4;
        double resultEperado = 24;
        // Executa
        double resultAtual = calcAreaRetangulo(comprimento, largura);

        // Valida
        Assert.assertEquals(resultAtual, resultEperado);

    }
    @Test
    public void testCalcAreaTriangulo(){
        // Configura
        double comprimento = 8;
        double largura = 3;
        double resultEsperado = 12;
        // Executa

        // Valida

    }
    @Test
    public void testCalcAreaCirculo(){
        // Configura
        double raio = 2.5;
        double resultEperado = 19.634954084936208;

        // Executa
        double resultAtual = calcularAreaCirculo(raio);
        // Valida


    }

}
