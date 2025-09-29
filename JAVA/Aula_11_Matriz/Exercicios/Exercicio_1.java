/**
 *
 * @author Marcos Einecke
 * 
 * 1. Somados Elementos de uma Matriz: Dada uma matriz 3x3 de inteiros, 
 * some todos os elementos da matriz e exiba o resultado.
 * 
 */

package Aula_11_Matriz.Exercicios;

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("");
        
        int [][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        
    };
        
     //Exibir Matriz
        System.out.println("Matriz");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " | ");
            }
            System.out.println();
        }
        
        int soma = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += matriz [i][j];
            }
        }
        
        System.out.println("");
        System.out.println( "Essa é a soma dos elementos da Matriz :"+soma);
        System.out.println("");
        System.out.println("");
    }
        
    }

