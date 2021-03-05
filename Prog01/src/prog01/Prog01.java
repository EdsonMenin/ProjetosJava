/*
* Na primeira linha do arquivo da classe smepre fica a definição do pacote onde está
* o arquivpo da classe
*/

package prog01;

import java.util.Scanner;

/**
 * Em seguida temos a definição da classe
 * @author memem
 */
public class Prog01 {
    
    static String nome;
    static int idade;
    
    /*
    * Este método é o principal, chamado pelo SO para iniciar a execução
    */

    public static void main(String[] args) {
        // Nosso Código, para iniciar o fluxo de execução com mensagens....
        // Aqui podemos passar mensagens para objetos existentes ou instanciar
        // novos objetos e passar mensagens
        
        dizerOla(); // esta é uma mensagem!
        lerDadosPessoa();
        mostraMensagem();
    }
    
    public static void dizerOla() {
        System.out.println("Olá, Mundo Java!");
    }

    private static void lerDadosPessoa() {
        System.out.print("Digite o nome: ");
        nome = new Scanner(System.in).nextLine();
        
        System.out.print("Digite a idade: ");
        idade = new Scanner(System.in).nextInt();

    }

    private static void mostraMensagem() {
        System.out.print(nome);
        System.out.println(", você viveu aproximadamente "+(idade * 365)+" dias!");
        //mostrar qual faixa etaria das pessoas
        // Jovewns - Até 9 anos!
        // Adultos - entre 20 até 59!
        // Idosos - mais de 60!
        
        if( idade <= 19)
            System.out.println("Você é jovem!");
        
        else if( idade >= 20 && idade <= 59 )
            System.out.println("Você é adulto!");
        
        else
            System.out.println("Você é idoso!");
                   
    }
}
