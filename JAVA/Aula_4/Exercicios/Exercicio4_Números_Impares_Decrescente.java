/**
 * @author Marcos Einecke
 *
 * 4. Exibir os números ímpares de 9 a 1 em ordem decrescente.
 *
 */
package Aula_4.Exercicios;

import java.util.Scanner;

public class Exercicio4_Números_Impares_Decrescente {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      
        System.out.println("");
        System.out.println("");

        for (int i = 9; i >= 1; i -= 2) {
            System.out.println(i);
        }


    }

    }