import org.testng.Assert;
import org.testng.annotations.Test;
import static br.com.iterasys.CalcAreaGPT.*;


public class TestCalcAreaGPT {


        @Test
        public void testCalcularAreaQuadrado() {
            double lado = 5.0;
            double expected = 25.0;
            double actual = calcularAreaQuadrado(lado);
            Assert.assertEquals(actual, expected);
        }

        @Test
        public void testCalcularAreaRetangulo() {
            double comprimento = 6.0;
            double largura = 4.0;
            double expected = 24.0;
            double actual = calcularAreaRetangulo(comprimento, largura);
            Assert.assertEquals(actual, expected);
        }

        @Test
        public void testCalcularAreaTriangulo() {
            double base = 8.0;
            double altura = 3.0;
            double expected = 12.0;
            double actual = calcularAreaTriangulo(base, altura);
            Assert.assertEquals(actual, expected);
        }

        @Test
        public void testCalcularAreaCirculo() {
            double raio = 2.5;
            double expected = 19.634954084936208;
            double actual = calcularAreaCirculo(raio);
            Assert.assertEquals(actual, expected);
        }
    }


