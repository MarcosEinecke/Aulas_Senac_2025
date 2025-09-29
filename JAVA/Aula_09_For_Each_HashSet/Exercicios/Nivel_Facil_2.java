/**
 * @author Marcos Einecke
 * 
 * 2. Exibir elementos de uma lista de strings em letras maiúsculas
 * 
 */

package Aula_09_For_Each_HashSet.Exercicios;

import java.util.Scanner;

public class Nivel_Facil_2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String [] letras  = {"a","b","c","d"};
        System.out.println("");
        System.out.println("");
        
       
        for( String letrasM : letras ) {
     System.out.println (letrasM.toUpperCase());                       
    }
        System.out.println("");
        System.out.println("");
    }    
    }
