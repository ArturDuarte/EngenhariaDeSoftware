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
public class CriptografarTest {
    
    public CriptografarTest() {
    }

    @Test
    public void testCriptografa() {
        String nome = "artur";
        Criptografar cri = new Criptografar();
        int chave = 5;
        String saida = cri.Criptografa(nome,chave);
        assertEquals(saida, "fwyzw");
    }

    @Test
    public void testDesCriptografa() {
        String nome = "fwyzw";
        Criptografar cri = new Criptografar();
        int chave = 5;
        String saida = cri.Criptografa(nome,chave);
        assertEquals(saida, "artur");
    }
    
}
