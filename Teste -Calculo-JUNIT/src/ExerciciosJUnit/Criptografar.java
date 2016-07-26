/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosJUnit;

import java.util.Scanner;


public class Criptografar {
    
    public String Criptografa(String nome,int chave){
    String saida = "";
    for(int i = 0; i < nome.length() ;i++){
        int aux = (int) nome.charAt(i);
        aux = aux + chave;
        if (aux > 122){
            int cal = aux - 122;
            aux = 97 + cal;
        }
        saida += (char) aux;
    }
    return saida;
}
    public String desCriptografa(String nome,int chave){
    String saida = "";
    for(int i = 0; i < nome.length() ;i++){
        int aux = (int) nome.charAt(i);
        aux = aux - chave;
        if (aux < 97){
            int cal = aux - 97;
            aux = 122 - cal;
        }
        saida += (char) aux;
    }
    return saida;
}
    
    
}
