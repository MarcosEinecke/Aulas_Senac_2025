/**
 *Faça um algoritmo que conte 0 até o número que o usuário escolher,
 * podendo também escolher a variação do contador. Contar de 3 em 3 por
 * exemplo. No final, complemento o algoritmo para mostrar o maior número
 * digitado.
 *
 *  * @author Marcos Einecke
 */
package Exemplos;

import java.util.Scanner;

public class Somador_While_Aula5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        int cont = 1, soma = 0, numero;
        int maior = Integer.MIN_VALUE;

        while (cont <= 5) {
            System.out.println("Digite o " + cont + "º valor");
            numero = sc.nextInt();
            if (numero > maior) {
                maior = numero;

            }
            soma += numero;
            cont++;
        }

        System.out.println("A soma de todas os valores é: " + soma);
        System.out.println("O maior número digitado é: " + maior);
        System.out.println("");
        System.out.println("");
    }

}
