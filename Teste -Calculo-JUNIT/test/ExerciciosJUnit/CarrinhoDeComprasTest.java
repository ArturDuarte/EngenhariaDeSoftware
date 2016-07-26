/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosJUnit;

import ExerciciosJUnit.CarrinhoDeCompras;
import ExerciciosJUnit.Item;
import static jdk.nashorn.internal.objects.NativeRegExp.test;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarrinhoDeComprasTest {

    @Test
    public void MaiorValor() {

        CarrinhoDeCompras car = new CarrinhoDeCompras();

        Item blusa = new Item("blusa", 3, 3.4);
        Double maior = 3.4;
        car.adiciona(blusa);
        assertEquals(car.VerificaMaior(), maior, 0.00);
    }

    @Test
    public void MaiorValorItens() {

        CarrinhoDeCompras car = new CarrinhoDeCompras();

        for (int i = 0; i < 5; i++) {
            Item prod = new Item("sapato", 3, 3.5);
            if (i == 3) {
                prod = new Item("sandalha", 4, 3.4);
            }
            car.adiciona(prod);
            
        }
        //double 3.5 para comparar maior
         assertEquals(car.VerificaMaior(), 3.5, 0.00);
    }
    
    public void SemItem(){
        CarrinhoDeCompras car = new CarrinhoDeCompras();
        
        assertEquals(car.VerificaMaior(), 0, 0.00);
    }
            
}




