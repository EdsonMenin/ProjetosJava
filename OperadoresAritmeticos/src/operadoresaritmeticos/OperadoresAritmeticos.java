/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author memem
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        
        System.out.println("A média é igual a " + m);
        
        int numero = 10;
        int valor = 4 + numero--;
        System.out.println(valor);
        valor += 5;
        System.out.println(numero);
        System.out.println(valor);
        
        
        int exp = (int) Math.pow(5,2);
        
        System.out.println(exp);
        
        
        float v = 8.3f;
        int ar = (int) Math.floor(v);
        System.out.println(ar);
        ar = (int) Math.ceil(v);
        System.out.println(ar);
        ar = (int) Math.round(v);
        System.out.println(ar);
        
        
        double ale = Math.random();
        int n = (int) (0 + ale * (60 - 0));
        System.out.println(n);
        
    }
    
}
