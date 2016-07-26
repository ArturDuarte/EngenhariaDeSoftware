/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author Notebook-Acer
 */
public class Calculos {
    static int a,b;
    
    public static void valor(int arg, int brg){
        a = arg;
        b = brg;
    }
    
    public static int getSoma(){
        return a+b;
    }
    
    public static int getSubtracao(){
        return a-b;
    }
    
    public static int getDivisao(){
        
        if( a== 0){
            return 0;
        }
        if( b== 0){
            return 0;
        }
        return a/b;
    }
    
    public static int getMultiplicacao(){
        return a*b;
    }
    
}
