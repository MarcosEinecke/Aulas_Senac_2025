/**
 *
 * @author Marcos Einecke
 */
package Aula_10_HashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exemplo_HashSet_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();

        System.out.println("");
        System.out.println("");

        System.out.println("Digite 5 números para o primeiro conjunto: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Número " + (i + 1) + " : ");
            conjunto1.add(sc.nextInt());
        }

        System.out.println("Digite 5 números para o primeiro conjunto: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Número " + (i + 1) + " : ");
            conjunto2.add(sc.nextInt());
        }

        System.out.println("");
        System.out.println("");
        
        
          Set<Integer> intersecao = new HashSet<>(conjunto1);
          intersecao.retainAll(conjunto2);
          
          
          System.out.println("Interseção dos dois conjuntos: "+intersecao);
          
        
        
    }

}
