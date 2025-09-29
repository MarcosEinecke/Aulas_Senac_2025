/**
 * @author Marcos
 *
 *5. Crie um HashSet de strings e adicione nomes de cores.
 * Converta o HashSet em uma lista e exiba os elementos.
 *
 */
package Aula_10_HashSet.Exercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Aula_10_Exercicio_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> cores = new HashSet<>();

        System.out.println("");
        System.out.println("");

        System.out.println("Vamos criar uma lista com 5 cores: ");
        System.out.println("");
        System.out.println("");

        for (int i = 1; i < 6; i++) {
            System.out.println("Infome " + i + "º cor :");
            String cor = sc.nextLine();
            System.out.println("");

            cores.add(cor);
        }

        List<String> listaCores = new ArrayList<>(cores);

        System.out.println("");
        System.out.println("");

        for (String lista : listaCores) {
            System.out.println(lista);
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Essa é sua lista de cores.");
        System.out.println("");
        System.out.println("");

    }

}
