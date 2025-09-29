/**
 * @author TI
 *
 *
 */
package Aula_10_HashSet;

import java.util.HashSet;
import java.util.Set;

public class Exemplos_HashSet {

    public static void main(String[] args) {
        Set<String> frutas = new HashSet<>();

        frutas.add("Maça");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Maça");  //adicionando elemento duplicado
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(frutas); // Laranja,Maça, Banana [Ordem não garantida]
        
        
        
        System.out.println("");
        System.out.println("");
        for (String fruta : frutas ) {
            System.out.println(fruta);
            
        }

        //verificando se um elemente existe
        
        System.out.println("");
        System.out.println("");
        if( frutas.contains("Banana")){
            System.out.println("Banana encontrada");
            
        }else{
            System.out.println("Banana não encontrada");
        }
        
        
    }

}
