/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosJUnit;

/**
 *
 * @author Notebook-Acer
 */
public class VerificaCPF {
    public boolean verificaPrimeiroDigito(String cpf){
        int valor = 10;
        int soma = 0;
       for(int i = 0; i <=8 ;i++){
           int aux = Integer.parseInt(cpf.charAt(i)+"");
           
           soma += aux * valor--;
                      
       }
       int resultado = soma%11;
       if(resultado < 2){
           if(cpf.charAt(9)== '0'){
               return true;
           }
       }
       
       int res = 11 - resultado;
       if(res == Integer.parseInt(cpf.charAt(9)+"")){
           return true;
       }else{
           return false;
       }
       
    }
    
    public boolean verificaUltimoDigito(String cpf){
        int valor = 11;
        int soma = 0;
        for(int i = 0; i <=9 ;i++){
            int aux = Integer.parseInt(cpf.charAt(i)+"");
            
            soma += aux * valor--;
            
        }
        int resultado = soma%11;
       if(resultado < 2){
           if(cpf.charAt(10)== '0'){
               return true;
           }
       }
       
        int res = 11 - resultado;
       if(res == Integer.parseInt(cpf.charAt(10)+"")){
           return true;
       }else{
           return false;
       }
        
        
    }
}

