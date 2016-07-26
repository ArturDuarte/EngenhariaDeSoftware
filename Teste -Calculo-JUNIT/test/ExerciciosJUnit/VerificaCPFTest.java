/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosJUnit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Notebook-Acer
 */
public class VerificaCPFTest {
    
    public VerificaCPFTest() {
    }

    @Test
    public void testVerificaPrimeiroDigito() {
        String cpf = "16616010813";
        VerificaCPF ver = new VerificaCPF();
        boolean saida = ver.verificaPrimeiroDigito(cpf);
        assertEquals(true , saida);
    }

    @Test
    public void testVerificaUltimoDigito() {
         String cpf = "16616010813";
        VerificaCPF ver = new VerificaCPF();
        boolean saida = ver.verificaPrimeiroDigito(cpf);
        assertEquals(true , saida);
    }
    
}
