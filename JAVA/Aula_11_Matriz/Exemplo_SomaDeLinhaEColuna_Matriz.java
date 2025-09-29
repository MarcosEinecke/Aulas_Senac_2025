/**
 *
 * @author Marcos Einecke
 * 
 * Matriz 4x4, calcular a soma dos elementos de cada linha e de cada 
 * coluna, e exiba os resultados.
 * 
 */

package Aula_11_Matriz;

import java.util.Scanner;

public class Exemplo_SomaDeLinhaEColuna_Matriz {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int [4][4];
        
        

        // Entrar com os valores da matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]:"); //Elemento [1][1]
                matriz[i][j] = sc.nextInt();
            }
        }
        
        
        //Exibir Matriz
        System.out.println("Matriz");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " | ");
            }
            System.out.println();
        }

        // Calcular das soma das linhas e colunas
        for (int i = 0; i < 4; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            for (int j = 0; j < 4; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }
            System.out.println("\nSoma da linha " + (i + 1) + " : " + somaLinha);
            System.out.println("Soma da coluna " + (i + 1) + " : " + somaColuna);
        }
    }
}