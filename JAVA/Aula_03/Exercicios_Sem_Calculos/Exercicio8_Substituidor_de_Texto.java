/*
 * @uthor: Marcos Einecke
 * 8. Substituidor de Texto: Crie um programa que leia uma frase e substitua todas as ocorrências da palavra "Java" por "Programação".
DICA: "String novaFrase = frase.replace("Java", "Programação");"
 * 
 */

package Aula_03.Exercicios_Sem_Calculos;

import java.util.Scanner;


public class Exercicio8_Substituidor_de_Texto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase, novaFrase;

        System.out.println();
        System.out.println();
        System.out.println("--- SUBSTITUIDOR DE TEXTO ---");
        System.out.println();
        System.out.println();
        System.out.print("Digite uma frase: ");
        frase = teclado.nextLine();
        System.out.println();
        System.out.println();

        novaFrase = frase.replace("Java", "Programação");

        System.out.println("Frase original: " + frase);
        System.out.println("Frase modificada: " + novaFrase);
        System.out.println();
        System.out.println();

        teclado.close();
        
    }

}
