/**
 * @author Marcos Einecke
 *
 * Dificuldade: Difícil
*
*10. Jogo de Adivinhação: DESAFIO 
*Gerar um número aleatório entre 1 e 100 e solicitar ao usuário que adivinhe o número, 
*fornecendo dicas (maior ou menor) a cada tentativa. Limitar o número de tentativas a 7.
  */

package main.JAVA.Aula_4.Exercicios;

import java.util.Scanner;

public class Exercicio10_Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        int tentativas = 7;
        int palpite;
        boolean acertou = false;
        System.out.println();
        System.out.println();
        System.out.println(" BEM VNDO AO JOGO DE ADIVINHACAO");
        System.out.println();
        System.out.println(" Tente adivinhar o nmero que estou pensando entre 1 e 100.");
        System.out.println("Voce tem 7 tentativas. Boa sorte!");
        System.out.println();
        System.out.println();
        System.out.println("Escolha um numero entre 1 e 100: ");
        for (int i = 1; i <= tentativas; i++) {

            palpite = teclado.nextInt();
            System.out.println();
            if (palpite < 1 || palpite > 100) {
                System.out.println("Por favor, escolha um numero entre 1 e 100.");
                i--;
                continue;
            }
            if (palpite == numeroAleatorio) {
                System.out.println("Parabens! Voce acertou o numero em " + i + " tentativas.");
                acertou = true;
                break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("Tente um numero maior.");
            } else {
                System.out.println("Tente um numero menor.");
            }
            System.out.println("Voce ainda tem " + (tentativas - i) + " tentativas restantes.");
            System.out.println("Escolha outro numero entre 1 e 100: ");
        }
        System.out.println();
        System.out.println();
        if (!acertou) {
            System.out.println("Suas tentativas acabaram. O numero era: " + numeroAleatorio);
            System.out.println("Sorte na proxima vez!");
            System.out.println();
            System.out.println();
        }
    }

}
