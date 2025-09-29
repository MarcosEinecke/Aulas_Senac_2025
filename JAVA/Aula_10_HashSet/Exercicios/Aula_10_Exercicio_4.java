/**
 * @author Marcos
 *
 *4. Crie um HashSet de strings e adicione nomes de cidades.
 * Verifique se o conjunto está vazio.
 *
 */
package Aula_10_HashSet.Exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Aula_10_Exercicio_4 {

    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();

        nomes.add("Rio de Janeiro");
        nomes.add("Tramandaí");
        nomes.add("Imbé");
        nomes.add("São Paulo");
        nomes.add("Porto Alegre");

        for (String lista : nomes) {
            System.out.println(lista);
            
           
        }
        
        
        
        System.out.println("");
        System.out.println("");
        
      
        
        
        System.out.println(nomes.isEmpty());
        
    }

}
