package main.JAVA.Aula_2.Exercicios;

import java.util.Scanner;

/*@author MarcosEinecke*/

/*Exercício 4 – Calcular a hipotenusa de um triângulo retângulo
Utiliza funções aritméticas da classe Math para calcular a hipotenusa. */

public class Exercicio4_Hipotenusa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor do cateto oposto: ");
        double catetoOposto = teclado.nextDouble();
        System.out.print("Digite o valor do cateto adjacente: ");
        double catetoAdjacente = teclado.nextDouble();
        double hipotenusa = Math.hypot(catetoOposto, catetoAdjacente);
        System.out.printf("A hipotenusa do triângulo retângulo e: %.2f%n", hipotenusa);
        teclado.close();
    }

}
