/*
 3. Dobro e Terça Parte: Escreva um algoritmo que leia um número real e calcule o dobro e a terça parte desse número. 
Exiba os resultados na tela, formatando a terça parte com quatro casas decimais.
 */
package Aula_1;

import java.util.Scanner;

public class Exercicio3_Doblo_e_Terça_Parte {

    public static void main(String[] args) {
        /*
VARIAVEIS
         */

        double n;
        double dobro;
        double terça;

        Scanner teclado = new Scanner(System.in);

        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("                        DOBRO E TERÇA PARTE                                 ");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("                        INFORME UM NÚMERO:                                  ");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        n = teclado.nextDouble();
        dobro = n * 2;
        terça = n / 3;

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("NÚMERO INFORMADO: " + n);
        System.out.println("DOBRO DO NÚMERO:   " + dobro);
        System.out.println("");
        System.out.printf("TERÇA PARTE DO NÚMERO:  %.4f%n", terça);
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");

    }
}
