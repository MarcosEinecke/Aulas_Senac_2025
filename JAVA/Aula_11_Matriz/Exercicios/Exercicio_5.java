/**
 *
 * @author Marcos Einecke
 *
 * 5. Multiplicação por Escalar: Multiplique todos os elementos de uma matriz 3x3
 * por um número escalar fornecido pelo usuário / matriz[i][j] *= escalar;
 *
 */
package Aula_11_Matriz.Exercicios;

import java.util.Scanner;

public class Exercicio_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}

        };

        System.out.println("");
        System.out.println("");

        System.out.println("VAMO MUTIPLICAR A MATRIZ: ");
        System.out.println("");
        System.out.println("");

        //Exibir Matriz
        System.out.println("Matriz");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " | ");
            }
            System.out.println();
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Qual o número que você quer mutiplicar a Matriz ?");
        int numero = sc.nextInt();

        System.out.println("");
        System.out.println("");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] *= numero;
            }
        }

        //Exibir Matriz
        System.out.println("Matriz");
        for (int[] linha : matriz) {
            System.out.println("");
            for (int elemento : linha) {
                System.out.print(elemento + " | ");
            }

        }

    }

}
