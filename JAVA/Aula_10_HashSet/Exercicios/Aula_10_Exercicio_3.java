/**
 * @author Marcos
 *
 *3. Crie um HashSet de números inteiros e adicione números de 1 a 5.
 * Limpe o conjunto e verifique se está vazio.
 *
 */
package Aula_10_HashSet.Exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Aula_10_Exercicio_3 {

    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        System.out.println("");
        System.out.println("");

        System.out.println("Vamos ver o conjunto de números: ");
        System.out.println("");

        for (int lista : numeros) {
            System.out.println(lista);
        }

        System.out.println("");
        System.out.println("");
        System.out.println("Vamos esvaziar o conjunto.");
        System.out.println("");

        numeros.remove(1);
        numeros.remove(2);
        numeros.remove(3);
        numeros.remove(4);
        numeros.remove(5);

        System.out.println("Esse é o conjunto atualizado");
        System.out.println("");
        System.out.println("");

        for (int lista2 : numeros) {
            System.out.println(lista2);

        }

    }
}
