/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import org.junit.Test;
import static org.junit.Assert.*;
import teste.Calculos;

/**
 *
 * @author Notebook-Acer
 */
public class CalculosTest {
   @Test
   public void testeSoma(){
      
      int a = 2;
      int b = 2;
      int resultEspe = 4;
      Calculos.valor(a, b);
      int resul = Calculos.getSoma();
      assertEquals(resultEspe, resul);
  }
   @Test
   public void testeSomaNegativo(){
        
      int a = -2;
      int b = -2;
      int resultEspe = 0;
      Calculos.valor(a, b);
      int resul = Calculos.getSubtracao();
      assertEquals(resultEspe, resul);
   }
   @Test
   public void testeSubtrair(){
        Calculos c = new Calculos();
      int a = 2;
      int b = 2;
      int resultEspe = 0;
      Calculos.valor(a, b);
      int resul = Calculos.getSubtracao();
      assertEquals(resultEspe, resul);
   }
   @Test
   public void testeDivisao(){
       
      int a = 2;
      int b = 2;
      int resultEspe = 1;
      Calculos.valor(a, b);
      int resul = Calculos.getDivisao();
      assertEquals(resultEspe, resul);
   }
   @Test
   public void testeMultiplicacao(){
        
      int a = 2;
      int b = 2;
      int resultEspe = 4;
      Calculos.valor(a, b);
      int resul = Calculos.getMultiplicacao();
      assertEquals(resultEspe, resul);
   }
   
}
