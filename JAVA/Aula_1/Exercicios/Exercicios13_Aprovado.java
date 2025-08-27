package Aula_1.Exercicios;

import java.util.Scanner;

/**
 *
 * @author MarcosEinecke
 */
public class Exercicios13_Aprovado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = teclado.next();
        System.out.println("Qual foi sua primeira nota?");
        double nota1 = teclado.nextDouble();

        System.out.println("Qual foi sua segunda nota?");

        double nota2 = teclado.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Sua media foi" + media);

        if (media >= 7) {
            System.out.println("Aprovado!");

        } else {
            System.out.println("Reprovado");

        }

    }

}
