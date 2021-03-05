package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, tv=0, tp=0, ti=0, ac=0, med=0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um numero: <br> <em>(Valor 0 interrompe)</em></html>"));
            
            s+=n;
            tv++;
            
            if(n%2 == 0){
                tp++;
            }
            else{
                ti++;
            }
            
            if(n > 100){
                ac++;
            }

        }while( n != 0);
        
        med = s/tv;
        
        JOptionPane.showMessageDialog(null, "<html>Resultado <br> "
                                                + "Total de Valores: "+tv+"<br>"
                                                + "Total de pares: "+tp+"<br>"
                                                + "Total de Impares: "+ti+"<br>"
                                                + "Acima de 100: "+ac+"<br>"
                                                + "Media dos valores: "+med+"</html>", "Dados Gerais",JOptionPane.WARNING_MESSAGE);
        
    }
    
}
