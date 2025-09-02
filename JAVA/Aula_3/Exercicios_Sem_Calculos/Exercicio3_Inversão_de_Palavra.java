package Aula_3.Exercicios_Sem_Calculos;

import java.util.Scanner;

/**
 * @author TI Inversor de Palavra: Faça um programa que leia uma palavra e aexiba invertida. 
 * DICA:" String invertida = new StringBuilder(palavra).reverse().toString();" *
 */
public class Exercicio3_Inversão_de_Palavra {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("           INVERSOR DE PALAVRAS              ");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Informe uma palavras:");
        String palavra = teclado.nextLine();
        String invertida = new StringBuilder(palavra).reverse().toString();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("A sua palavra invertida fica "+invertida);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

}