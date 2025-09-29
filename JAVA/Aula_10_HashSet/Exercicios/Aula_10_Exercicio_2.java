/**
 * @author Marcos
 *
 *2. Crie um HashSet de strings e adicione nomes de frutas.
 * Remova uma fruta específica e exiba o conjunto resultante.
 *
 */
package Aula_10_HashSet.Exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Aula_10_Exercicio_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> frutas = new HashSet<>();
        String resp ;

        frutas.add("Banana");
        frutas.add("Maça");
        frutas.add("Laranja");
        frutas.add("Melancia");
        frutas.add("Pera");

        do {
        
        
        System.out.println("");
        System.out.println("");
        
        
        System.out.println("Vamos ver a lista de compras: ");
        System.out.println("");
        
        
        for (String fruta : frutas){
        System.out.println(fruta);        
        }
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Qual fruta você gostaria de remover ?");
        String excluir = sc.nextLine();
        
        frutas.remove(excluir);
        
        System.out.println("");
        System.out.println("");
        
        
        System.out.println("A lista atualizada: ");
        System.out.println("");
        
        for (String frutas2 : frutas) {
            System.out.println(frutas2);            
        }
        
        
        
            System.out.println("");
            System.out.println("");
            
            System.out.println("Caso queira reiniciar o programa escreva(inicio),para  encerrar o programa (sair): ");
            resp = sc.nextLine();
           
          
        
        }while (resp == "sair");
        
        System.out.println("");
        System.out.println("");
    }
}
