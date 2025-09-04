/**
 * @author Marcos Einecke
 *
 * 5. Calcular a média de 5 números informados pelo usuário.
 *
 */
package main.JAVA.Aula_4.Exercicios;

import java.util.Scanner;

public class Exercicio5_Somador_de_5_Numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("        VAMOS SOMAR        ");
        System.out.println();
        System.out.println();
        System.out.println("Informe 5 números para somar:");
        System.out.println();

        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int numero = teclado.nextInt();
            soma += numero;
        }
        System.out.println();
        System.out.println();
        System.out.println(" A soma dos números é: " + soma);
        teclado.close();
        System.out.println();
        System.out.println();

    }

}
