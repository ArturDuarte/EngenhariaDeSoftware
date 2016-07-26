/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosJUnit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<Item>();
    }

    public void adiciona(Item item) {
        this.itens.add(item);
        
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public double VerificaMaior() {
        double maior = 0;
        for (Item item : itens) {
            if (item.getValorUnitario() > maior) {
                maior = item.getValorUnitario();
            }
        }
        return maior;
    }

}
