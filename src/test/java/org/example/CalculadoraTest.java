package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSomar(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(3,5);
        assertEquals(8, resultado);
    }

    @Test
    public void testSubtrair(){
        Calculadora calculadora = new Calculadora();
        int result = calculadora.subtrair(3,5);
        assertEquals(-2, result);
    }

    @Test
    public void testMultiplicar(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(3,5);
        assertEquals(15, resultado);

    }

    @Test
    public void testDividir(){
        Calculadora calc = new Calculadora();
        int result = calc.dividir(12,6);
        assertEquals(2, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividirPorZero(){
        Calculadora calc = new Calculadora();
        calc.dividir(12,0);
    }

}
