/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package numerosprimos;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juana
 */
public class NumerosPrimosTest {
    
    @Test
    public void generaPrimos(){
        int[] resultado = CribaEratostenes.generarPrimos(0);
        int[] esperado = {};
        assertArrayEquals(esperado,resultado);
    }
    @Test
    public void generaPrimos(){
        int[] resultado = CribaEratostenes.generarPrimos(2);
        assertEquals(1, resultado.length);
        assertEquals(2,resultado[0]);
    }
    @Test
    public void generaPrimos() {
        int[] resultado = CribaEratostenes.generarPrimos(3);
        int [] esperado = {2,3};
        Assert.assertArrayEquals(esperado, resultado);
    }
    @Test
    public void testGenerarPrimos() {
        int[] resultado = CribaEratostenes.generarPrimos(100);
        int[] esperado = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        assertArrayEquals(esperado, resultado);
    }
}
