package Aula_1.Exercicios_2;

import java.util.Scanner;

/**
 *
 * @author MarcosEinecke
 */
public class Exercicio1_Saudação {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual seu nome completo?");
        String nome = teclado.nextLine();
        System.out.println("Olá " + nome + ", seja bem vindo ao Java!");
    }

}
