/*
 * @uthor: Marcos Einecke
 * 
 */

package main.JAVA.Exemplos;

import java.util.Scanner;

public class Exemplos_de_For_Aula4 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("--- CONTADOR ---");
        System.out.println();
        System.out.println();

        /*
         * //Contador de 1 a 10
         * // for (int i = 1; i <= 10; i++) {
         * // System.out.println(i);
         * }
         */

        /*
         * //Contador de 10 a 1
         * for (int i = 10; i >= 1; i-=3) {
         * System.out.println(i);
         * }
         */

        /*
         * // Ler 5 valores digitados pelo usuário e exiba a soma total
         * Scanner teclado = new Scanner(System.in);
         * int soma = 0;
         * for (int i = 1; i <= 5; i++) {
         * System.out.println("Digite um valor: ");
         * int v = teclado.nextInt();
         * soma += v; // soma = soma + v
         * 
         * }
         * System.out.println("A soma dos valores é : " + soma);
         * System.out.println();
         * System.out.println();
         */

        /*
         * //EXEMPLO: Tabuada
         * Scanner teclado = new Scanner(System.in);
         * System.out.print("Digite um numero: ");
         * int numero = teclado.nextInt();
         * for (int i = 1; i <= 10; i++) {
         * int resultado = numero * i;
         * System.out.println(numero + " x " + i + " = " + (numero * i));
         * 
         * }
         */

        // EXEMPLO: Mostrar quantos valores digitados estão
        // entre 0 e 10, após 6 digitações

        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        int somaImpares = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite um valor: ");
            int v = teclado.nextInt();
            if (v >= 0 && v <= 10) {
                cont++;
                if (v % 2 == 0) {
                    somaImpares += v;
                }
            }
        }

        System.out.println("Ao todo foram digitados " + cont + " valores entre 0 e 10.");
        System.out.println("A soma dos valores ímpares entre 0 e 10 é: " + somaImpares);

        System.out.println();
        System.out.println();

    }

}
