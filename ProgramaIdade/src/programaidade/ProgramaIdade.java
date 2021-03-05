package programaidade;

import java.util.Scanner;
/**
 *
 * @author memem
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int ano = teclado.nextInt();
        int idade = 2021 - ano;
        
        System.out.println("Sua idade é de " + idade + " ano(s)");
        
        if(idade >= 18){
            System.out.println("MAIOR DE IDADE");
        }
        else{
            System.out.println("MENOR DE IDADE");
        }   
    }
}
