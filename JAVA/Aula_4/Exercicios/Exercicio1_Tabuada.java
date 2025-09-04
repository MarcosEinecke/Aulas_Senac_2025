package Aula_4.Exercicios;

import java.util.Scanner;

/**
 * @author Marcos Einecke 
 * Dificuldade: Fácil 1. Exibir a tabuada completa de 1 a
 * 10.
 *
 */
public class Exercicio1_Tabuada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("                  TABUADA                    ");
        System.out.println("");
        System.out.println("");
        System.out.println("Qual número você quer mutiplicar ? ");
        int numero = teclado.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

    }

}
