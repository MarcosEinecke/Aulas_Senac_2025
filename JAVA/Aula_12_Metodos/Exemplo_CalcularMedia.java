/**
 *
 * @author Marcos Einecke
 * 
 * Calcular a média de notas de diferentes alunos
 * 
 */


package Aula_12_Metodos;

import java.util.Scanner;

public class Exemplo_CalcularMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        
        System.out.println("Digite o número de alunos: ");
        int numAlunos = sc.nextInt();
        
        for (int i = 1; i <= numAlunos; i++) {
            System.out.print("\nDigite o número de notas para o aluno "+i+ " : ");
            int numNotas = sc.nextInt();
            double [] notas = new double[numNotas];
            
            
            for (int j = 0; j < numNotas; j++) {
                System.out.print("\nDigite a nota " +(j+1)+" : ");
                notas[j] = sc.nextDouble();
            }
            
            double media = calcularMedia(notas);
            System.out.println("A média do aluno "+i+ " é: "+media);
        }             
        
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0 ;
        for (double nota : notas) {
            soma += nota;
            
        }
        
        return soma / notas.length;
        
    }
    
    
    
}
