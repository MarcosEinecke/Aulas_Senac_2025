
package Aula_3.Exercicios_Sem_Calculos;

import java.util.Scanner;

/**
 * 1. Verificador de Nome: Faça um programa que leia o nome de uma pessoa e
 * verifique se ele contém mais de 5 caracteres.
 * Mostre uma mensagem apropriada. DICA: "if (nome.length() > 5)"*
 * 
 * @author MarcosEinecke
 */

public class Exercicio1_Nome {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("VAMOS DESCOBRIR QUANTOS CARACTERES TEM SEU NOME: ");
        System.out.println("");
        System.out.println("");
        System.out.println("Qual seu nome ?");
        String nome = teclado.nextLine();
        System.out.println("");
        System.out.println("");

        if (nome.length() > 5) {
            System.out.println("Seu nome tem mais de 5 caracteres");
        } else {
            System.out.println("Seu nome tem 5 ou menos caracteres");

            System.out.println();
            System.out.println();
            System.out.println("FIM DO PROGRAMA");

        }

    }

}