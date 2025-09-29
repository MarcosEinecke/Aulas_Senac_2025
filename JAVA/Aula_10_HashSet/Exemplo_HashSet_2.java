/**
 *
 * @author Marcos Einecke
 *
 *
 */
package Aula_10_HashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exemplo_HashSet_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> frutas = new HashSet<>();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("Quantas frutas você deseja adicionar?");

        int qtd = sc.nextInt();
        sc.nextLine(); // Para não buscar o Scanner adiciona outra scanner



        for (int i = 1; i <= qtd; i++) {
       
            System.out.println("Digite o nome da fruta " + i + " :");
            String fruta = sc.nextLine();
            boolean adicionada = frutas.add(fruta);
            if (!adicionada) {
                System.out.println("");
                System.out.println("");
                System.out.println("A fruta " + fruta + " já foi adicionada e será ignorada");

            }

        }

        System.out.println("");
        System.out.println("");
        System.out.println("Frutas adicionada (sem duplicadas)");
        for (String fruta : frutas) {
            System.out.println("");
            System.out.println("");
            System.out.println(fruta);
            System.out.println("");
            System.out.println("");

        }
        //Pesquisar um fruta

        System.out.println("");
        System.out.println("");
        System.out.println("Digite uma fruta para ver se ela está na lista:");
        String busca = sc.nextLine();
        if (frutas.contains(busca)) {
            System.out.println("");
            System.out.println("");
            System.out.println(busca + " encontrada.");

        } else {
            System.out.println("");
            System.out.println("");
            System.out.println(busca + " não encontrada.");
        }
    }

}
