/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicaomultiplaescolha;

import java.util.Scanner;

/**
 *
 * @author memem
 */
public class CondicaoMultiplaEscolha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.print("Digite a quantidade de pernas: ");
        int perna = t.nextInt();
        
        String tipo;
        
        switch(perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "E.T.";
                break;
        }
        
        System.out.println("O tipo, pela quantidade de pernas, é "+tipo);
        
    }
    
}
