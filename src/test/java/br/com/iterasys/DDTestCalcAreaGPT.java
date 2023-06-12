//package br.com.iterasys;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static br.com.iterasys.CalcAreaGPT.*;

/*
public class DDTestCalcAreaGPT {

        @DataProvider(name = "areas")
        public Object[][] getAreas() {
            return new Object[][] {
                    { 5.0, 25.0 },     // Lado do quadrado, área esperada
                    { 6.0, 4.0, 24.0 },     // Comprimento e largura do retângulo, área esperada
                    { 8.0, 3.0, 12.0 },     // Base e altura do triângulo, área esperada
                    { 2.0, 12.566370614359172 }  // Raio do círculo, área esperada
            };
        }

        @Test(dataProvider = "areas")
        public void testCalcularAreaQuadrado(double lado, double areaEsperada) {
            double areaCalculada = CalcAreaGPT.calcularAreaQuadrado(lado);
            Assert.assertEquals(areaCalculada, areaEsperada);
        }

        @Test(dataProvider = "areas")
        public void testCalcularAreaRetangulo(double comprimento, double largura, double areaEsperada) {
            double areaCalculada = CalcAreaGPT.calcularAreaRetangulo(comprimento, largura);
            Assert.assertEquals(areaCalculada, areaEsperada);
        }

        @Test(dataProvider = "areas")
        public void testCalcularAreaTriangulo(double base, double altura, double areaEsperada) {
            double areaCalculada = CalcAreaGPT.calcularAreaTriangulo(base, altura);
            Assert.assertEquals(areaCalculada, areaEsperada);
        }

        @Test(dataProvider = "areas")
        public void testCalcularAreaCirculo(double raio, double areaEsperada) {
            double areaCalculada = CalcAreaGPT.calcularAreaCirculo(raio);
            Assert.assertEquals(areaCalculada, areaEsperada);
        }

}
*/
