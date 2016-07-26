/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosJUnit;

import ExerciciosJUnit.TemperaturaCelsius;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Notebook-Acer
 */
public class TemperaturaCelsiusTest {
    
    public TemperaturaCelsiusTest() {
     
        
    }

    @Test
    public void testSomeMethod() {
        
        TemperaturaCelsius temp = new TemperaturaCelsius(2.2);
        Double Resu = temp.converteCelsiusParaFahrenheit();
        assertEquals(Resu, 35.96,0.00);
    }
    
}
