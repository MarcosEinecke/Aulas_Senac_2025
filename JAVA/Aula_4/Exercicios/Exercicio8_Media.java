/**
 * @author Marcos Einecke
 *
 * 8. Solicitar ao usuário a idade de 5 pessoas e calcular a média das idades.
 *
 */
package main.JAVA.Aula_4.Exercicios;

import java.util.Scanner;

public class Exercicio8_Media {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("*** CALCULO DA  MEDIA DAS IDADES ***");
        int idade, soma = 0;
        float media;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a idade da " + i + " pessoa: ");
            idade = teclado.nextInt();
            soma += idade;

        }
        System.out.println();
        media = (float) soma / 5;
        System.out.printf("A media das idades e: %.2f\n", media);
        System.out.println();
        System.out.println();
    }

}
