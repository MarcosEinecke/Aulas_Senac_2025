/**
 * @author Marcos Einecke
 *
 * 3. Calcular a soma dos números de 1 a 10.
 *
 */
package Aula_4.Exercicios;

import java.util.Scanner;

public class Exercicio3_Somador_de_1_a_10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0;
        System.out.println("");
        System.out.println("");

        for (int i = 0; i < 11; i++) {
            soma += i;
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("A soma dos valores listados é " + soma);
        System.out.println("");
        System.out.println("");
    }
}
