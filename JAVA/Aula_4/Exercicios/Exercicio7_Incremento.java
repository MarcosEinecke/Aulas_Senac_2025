/**
 * @author Marcos Einecke
 *
 * 7. Solicitar ao usuário um número inicial, um número final e um incremento, 
 * e exibir a contagem entre esses números com o incremento especificado.
 *
 */
package main.JAVA.Aula_4.Exercicios;

import java.util.Scanner;

public class Exercicio7_Incremento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numInicial, numFinal, incremento;

        System.out.println();
        System.out.println();
        System.out.println("  CONTADOR COM INCREMENTO  ");
        System.out.println();
        System.out.println();
        System.out.print("Digite o numero inicial: ");
        numInicial = teclado.nextInt();
        System.out.print("Digite o numero final: ");
        numFinal = teclado.nextInt();
        System.out.print("Digite o incremento: ");
        incremento = teclado.nextInt();
        System.out.println();
        System.out.println("Contagem:");
        System.out.println();
        System.out.println();
        for (int i = numInicial; i <= numFinal; i += incremento) {
            System.out.println(i);

        }

        System.out.println();
        System.out.println();
    }

}
