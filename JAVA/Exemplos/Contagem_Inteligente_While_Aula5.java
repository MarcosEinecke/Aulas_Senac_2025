/**
 * @author Marcos Einecke
 *
 * Faça um algoritmo que realize uma contagem inteligente permitindo que usuarios
 * possa escolher o inicio e fim da contagem. Podendo ser crescente ou  descrescente. 
 *
 */

package main.JAVA.Exemplos;

import java.util.Scanner;

public class Contagem_Inteligente_While_Aula5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("CONTAGEM INTELIGENTE");
        System.out.println("=======================================================");
        System.out.println("Inicio:  ");
        int inicio = sc.nextInt();
        System.out.println("Fim:  ");
        int fim = sc.nextInt();
        System.out.println("=======================================================");
        System.out.println(" CONTANDO....");
        System.out.println("=======================================================");
        if (inicio < fim) {
            int cont = inicio;
            while (cont <= fim) {
                System.out.print(cont + " ");
                cont++;
            }
        } else {
            int cont = inicio;
            while (cont >= fim) {
                System.out.print(cont + " ");
                cont--;
            }
        }

        System.out.println();
        System.out.println("=========================================================");
    }
}
