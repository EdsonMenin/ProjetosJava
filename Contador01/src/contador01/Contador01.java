/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author memem
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c = 0;
        while(c < 20){
            c++;
            if(c == 5 || c == 7){
                continue; 
            }
            if(c == 10){
                break;
            }
            System.out.println("Cambalhota "+ (c));   
        }        
    }
}
