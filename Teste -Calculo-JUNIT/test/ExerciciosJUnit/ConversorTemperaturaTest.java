/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosJUnit;

import ExerciciosJUnit.ConversorTemperatura;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Notebook-Acer
 */
public class ConversorTemperaturaTest {
    
    
    
    public ConversorTemperaturaTest() {
        
    }

    @Test
    public void testSomeMethod() {
        
        Double cel = 5.2;
        Double far = 212.0;
        
        Double resF = ConversorTemperatura.converteCelsiusParaFahrenheit(cel);
        Double resC = ConversorTemperatura.converteFahrenheitParaCelsius(far);
        System.out.println(resC);
        assertEquals(resF, 41.36,0.00);
        assertEquals(resC, 100,0.00);
    }
    
}
