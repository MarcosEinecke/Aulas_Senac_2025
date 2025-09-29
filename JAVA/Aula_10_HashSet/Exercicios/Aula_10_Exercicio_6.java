/**
 * @author Marcos
 *
 *6. Remova um elemento do HashSet: Crie um HashSet de strings com nomes de cidades.
 * Remova a cidade "São Paulo" do HashSet e exiba o conjunto resultante.
 *
 */
package Aula_10_HashSet.Exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Aula_10_Exercicio_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> cidades = new HashSet<>();

        cidades.add("Rio de Janeiro");
        cidades.add("Tramandaí");
        cidades.add("Imbé");
        cidades.add("São Paulo");
        cidades.add("Porto Alegre");

        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        for (String lista : cidades) {
            System.out.println(lista);
            
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Vamos remover São Paulo da lista");
        
        System.out.println("");
        System.out.println("");
        
        cidades.remove("São Paulo");
        
        System.out.println("Essa é a lista atualizada: ");
        System.out.println("");
        
        for (String lista2 : cidades) {
            System.out.println(lista2);
        }
        
        
        System.out.println("");
        System.out.println("");
    }

}
