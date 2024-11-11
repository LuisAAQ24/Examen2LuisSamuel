package com.example.examen2;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {


    // Test para el método convertirNumero
    @Test
    public void testConvertirNumeroBinario() {
        assertEquals(5, Calculadora.convertirNumero("101", 0)); // Caso base: 101 en binario es 5 en decimal
    }



    // Test para el método realizarOperacion
    @Test
    public void testRealizarOperacionSuma() {
        assertEquals(15, Calculadora.realizarOperacion(10, 5, "+")); // Caso base: 10 + 5 = 15
    }



    // Test para el método convertirADestino
    @Test
    public void testConvertirADestinoBinario() {
        assertEquals("1010", Calculadora.convertirADestino(10, 0)); // Caso base: 10 en decimal es 1010 en binario
    }



}

