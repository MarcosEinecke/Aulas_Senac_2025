/**
 *
 * @author Marcos Einecke
 * 
 * 
 */

package Exemplos;
public class Exemplos_Matriz_Notas {
    public static void main(String[] args) {
        
        double [][] notas = {
            {7.5,8.0,9.0}, // notas do aluno 1
            {5.5,6.0,7.0} // notas do aluno 2
        };
        
        for (int i=0; i < notas.length; i++) {
            double soma = 0;
            for (int j = 0; j < notas[i].length; j++){
                soma += notas [i][j]; 
            }
               double media = soma / notas [i].length;
               System.out.println(" Média do aluno "+(i+1)+ " : "+media);
            }
            System.out.println("");
        }
        
    }


