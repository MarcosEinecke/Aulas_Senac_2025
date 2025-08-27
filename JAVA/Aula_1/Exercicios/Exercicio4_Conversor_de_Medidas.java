/*
4. Conversor de Medidas: Crie um programa que leia uma distância em metros e exiba essa distância convertida em quilômetros e centímetros.
 */
package Aula_1;

import java.util.Scanner;

public class Exercicio4_Conversor_de_Medidas {

    public static void main(String[] args) {
        /*
         * VARIAVEIS
         */

        double distancia;
        double km;
        double cm;

        Scanner teclado = new Scanner(System.in);

        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("                        CONVERSOR DE MEDIDA                                 ");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("");
        System.out.println("");

        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("                INFORME A DISTÂNCIA PERCORIDA EM METROS:                    ");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        distancia = teclado.nextDouble();
        System.out.println("");
        System.out.println("");

        km = distancia / 1000;
        cm = distancia * 100;
        System.out.println("");
        System.out.println("");

        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("                AQUI ESTÁ A DISTANCIA EM CM E KM:                           ");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("KM =  " + km);
        System.out.println("CM =  " + cm);
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");

    }
}
