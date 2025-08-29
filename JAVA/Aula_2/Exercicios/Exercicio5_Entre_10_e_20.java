package main.JAVA.Aula_2.Exercicios;

import java.util.Scanner;

/**
 * 5. Faça um programa que leia um número inteiro e verifique se ele está entre
 * 10 e 20.
 * Se estiver, imprima "O número está entre 10 e 20". Caso contrário, imprima "O
 * número não está entre 10 e 20".
 */
public class Exercicio5_Entre_10_e_20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.print("Digite um numero inteiro: ");
        int numero = teclado.nextInt();
        if (numero >= 10 && numero <= 20) {
            System.out.println("O numero esta entre 10 e 20.");
        } else {
            System.out.println("O numero nao esta entre 10 e 20.");
        }
        teclado.close();
        System.out.println();
        System.out.println();
    }
}
