/*
 2. Antecessor e Sucessor: Faça um programa que leia um número inteiro e mostre na tela o seu antecessor e sucessor.
 */
package Aula_1;

import java.util.Scanner;

public class Exercicio2_Sucessor_e_Antecessor {

    public static void main(String[] args) {
        /*
VARIAVEIS
         */
        int sucessor;
        int antecessor;
        int n;

        Scanner teclado = new Scanner(System.in);
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("                        SUCESSOR E ANTECESSOR                               ");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");

        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("                        INFOME UM NÚMERO:                                   ");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        n = teclado.nextInt();
        sucessor = n + 1;
        antecessor = n - 1;

        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("NÚMERO QUE VOCÊ DIGITOU:  " + n);
        System.out.println("NÚMERO SUCESSOR:  " + sucessor);
        System.out.println("NÚMERO ANTECESSOR:  " + antecessor);
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");

    }
}
