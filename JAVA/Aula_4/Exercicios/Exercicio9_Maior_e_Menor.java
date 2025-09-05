/**
 * @author Marcos Einecke
 *
 * 9. Solicitar ao usuário 7 números e identificar o maior e o menor valor digitados.
 *
 */
package main.JAVA.Aula_4.Exercicios;

import java.util.Scanner;


public class Exercicio9_Maior_e_Menor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, maior, menor;
        System.out.println("    IDENTIFICAR MAIOR E MENOR NUMERO  ");
        System.out.println("=======================================");
        System.out.println();
        System.out.println();
        System.out.println("Digite 7 numeros: ");
        numero = teclado.nextInt();
        maior = numero;
        menor = numero; 
        for (int i = 1; i < 7; i++) {
            numero = teclado.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("O maior numero e: " + maior);
        System.out.println("O menor numero e: " + menor);
        System.out.println(
                "=======================================\n" +
                "            FIM DO PROGRAMA            \n" +
                "======================================="
        );
        System.out.println();
        System.out.println();
    }

}
