package br.com.iterasys;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static br.com.iterasys.CalcAreaGPT.calcularAreaCirculo;
import static br.com.iterasys.CalcAreaHD.*;
import static br.com.iterasys.DDCalcAreaHD.calcAreaQuadradoDD;

public class DDTestCalcAreaHD {

    @DataProvider(name = "TestarCalcAreasDD")
    public Object[][] TestarCalcAreasDD(){
        return new Object[][]{
                {5, 25},
                {6, 4, 24},
                {8, 3, 12},
                {2.5, 19.634954084936208}

        };
    }


    @Test(dataProvider = "TestarCalcAreasDD")
    public void testCalcAreaQuadradoDD(double lado, double resultEsperado){
        // Configura
        //double lado = 5;
        //double resultEsperado = 25;

        // Executa
        double resultAtual = DDCalcAreaHD.calcAreaQuadradoDD(lado);

        // Valida
        Assert.assertEquals(resultAtual, resultEsperado);
    }

    @Test(dataProvider = "TestarCalcAreasDD")
    public void testCalcAreaRetanguloDD(double comprimento, double largura, double resultEsperado){
        // Configura
        //double comprimento = 6;
        //double largura = 4;
        //double resultEsperado = 24;

        // Executa
        double resultAtual = DDCalcAreaHD.calcAreaRetanguloDD(comprimento, largura);

        // Valida
        Assert.assertEquals(resultAtual, resultEsperado);

    }
    @Test(dataProvider = "TestarCalcAreasDD")
    public void testCalcAreaTrianguloDD(double comprimento, double largura, double resultEsperado){
        // Configura
        //double comprimento = 8;
        //double largura = 3;
        //double resultEsperado = 12;

        // Executa
        double resultAtual = DDCalcAreaHD.calcAreaTrianguloDD(comprimento, largura);

        // Valida
        Assert.assertEquals(resultAtual, resultEsperado);
    }
    @Test(dataProvider = "TestarCalcAreasDD")
    public void testCalcAreaCirculoDD(double raio, double resultEsperado){
        // Configura
        //double raio = 2.5;
        //double resultEperado = 19.634954084936208;

        // Executa
        double resultAtual = DDCalcAreaHD.calcAreaCirculoDD(raio);

        // Valida
        Assert.assertEquals(resultAtual, resultEsperado);

    }
}
