package programaimc;

import java.util.Scanner;

public class ProgramaImc {

    static String nome;
    static double peso;
    static double altura;
    static double imc;
    
    public static void main(String[] args) {
        
        coletaDados();
        calculaImc();
    }

    private static void coletaDados() {
        
        System.out.print("Digite o nome: ");
        nome = new Scanner(System.in).nextLine();
        
        System.out.print("Digite o peso: ");
        peso = new Scanner(System.in).nextDouble();
        
        System.out.print("Digite a altura: ");
        altura = new Scanner(System.in).nextDouble();
        
        
    }

    private static void calculaImc() {
        
        imc = (peso / (altura * altura));
        
        System.out.print("Olá "+(nome)+", seu IMC é de "+(imc)+" e sua classificação é: ");
        
        if ( imc < 18.5 )
            System.out.println("MAGREZA");
            
        else if ( imc >= 18.5 && imc <= 24.9)
            System.out.println("NORMAL");
        
        else if ( imc >= 25 && imc <= 29.9)
            System.out.println("SOBREPESO");
        
        else if ( imc >= 30 && imc <= 39.9)
            System.out.println("OBESIDADE");
        
        else
            System.out.println("OBESIDADE GRAVE");
        
    }
    
}
