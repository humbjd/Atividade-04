package br.com.iterasys;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static br.com.iterasys.CalcAreaGPT.*;

public class DDTestCalcAreaGPT {

    @DataProvider(name = "formasGeometricas")
    public Object[][] formasGeometricasDataProvider() {
        return new Object[][] {
                { 5.0, 25.0 },   // Quadrado: lado = 5, área = 25
                { 6.0, 4.0, 24.0 },   // Retângulo: comprimento = 6, largura = 4, área = 24
                { 8.0, 3.0, 12.0 },   // Triângulo: base = 8, altura = 3, área = 12
                { 2.5, 19.634954084936208 }   // Círculo: raio = 2.5, área = 19.634954084936208
        };
    }

    @Test(dataProvider = "formasGeometricas")
    public void testCalcularArea(double... parametros) {
        int quantidadeParametros = parametros.length - 1;
        double expected = parametros[quantidadeParametros];
        double actual;

        switch (quantidadeParametros) {
            case 1:
                actual = calcularAreaQuadrado(parametros[0]);
                break;
            case 2:
                actual = calcularAreaRetangulo(parametros[0], parametros[1]);
                break;
            case 3:
                actual = calcularAreaTriangulo(parametros[0], parametros[1]);
                break;
            case 4:
                actual = calcularAreaCirculo(parametros[0]);
                break;
            default:
                throw new IllegalArgumentException("Número de parâmetros inválido!");
        }

        Assert.assertEquals(actual, expected);
    }


}
