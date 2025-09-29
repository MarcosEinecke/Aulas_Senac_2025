/**
 *
 * @author Marcos Einecke
 * 
 * 6. Subtração de Matrizes: Dadas duas matrizes 3x3, calcule a matriz resultante 
 * da subtração da primeira pela segunda e exiba o resultado.
 * / subtracao[i][j] = matriz[i][j] - matriz[i][j];
 * 
 */

package Aula_11_Matriz.Exercicios;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}

        };

         int[][] matriz2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}

        };

        
        
        System.out.println("");
        System.out.println("");

        System.out.println("VAMO SUBTRAÇÃO A MATRIZ: ");
        System.out.println("");
        System.out.println("");

        //Exibir Matriz
        System.out.println("Matriz");
        for (int[] linha : matriz1) {
            for (int elemento : linha) {
                System.out.print(elemento + " | ");
            }
            System.out.println();
        }

        System.out.println("");
        System.out.println("");
        
        
    }
    
}
