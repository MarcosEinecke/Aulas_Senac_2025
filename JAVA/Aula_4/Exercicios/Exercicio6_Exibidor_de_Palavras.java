/**
 * @author Marcos Einecke
 *
 * 6. Solicitar ao usuário um caractere e um número, e exibir o caractere repetido o número de vezes especificado.
 *
 */
package main.JAVA.Aula_4.Exercicios;

import java.util.Scanner;

public class Exercicio6_Exibidor_de_Palavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println(" REPITIDOR DE PALAVRAS ");
        System.out.print("Digite uma palavra: ");
        String caractere = scanner.nextLine();

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        String resultado = caractere.repeat(numero);
        System.out.println("Resultado: " + resultado);
        System.out.println();
        System.out.println();

        scanner.close();
    }

}
