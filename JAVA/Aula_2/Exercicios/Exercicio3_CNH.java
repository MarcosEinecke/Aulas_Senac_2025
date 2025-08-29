package main.JAVA.Aula_2.Exercicios;

import java.util.Scanner;

/*@author MarcosEinecke */

/*Exercício 3 – Verificar se uma pessoa pode dirigir
A pessoa deve ter 18 anos ou mais e possuir carteira de motorista (CNH). */

public class Exercicio3_CNH {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("VAMOS VER SE VOCE PODE DIRIGIR");
        System.out.println();
        System.out.println();
        System.out.println("Voce possui CNH? (S/N)");
        String cnh = teclado.next();

        if (cnh.equalsIgnoreCase("S")) {
            System.out.println("Que bom, voce pode dirigir!");
        } else if (cnh.equalsIgnoreCase("N"))
            System.out.println("Voce nao pode dirigir sem CNH!");
        System.out.println();
        System.out.println();
        System.out.println("Qual a sua idade?");
        int idade = teclado.nextInt();

        if (idade >= 18) {
            System.out.println("Voce pode dirigir, mas precisa fazer a CNH!");
        } else {
            System.out.println("Voce nao pode dirigir, pois e menor de idade!");

        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

}
