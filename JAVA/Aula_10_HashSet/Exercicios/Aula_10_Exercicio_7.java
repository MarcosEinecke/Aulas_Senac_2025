/**
 * @author Marcos Einecke
 *
 * 7. Exiba o tamanho do HashSet: Crie um HashSet de caracteres e adicione as letras do alfabeto.
 * Exiba o tamanho do HashSet.
 *
 */
package Aula_10_HashSet.Exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Aula_10_Exercicio_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Character> alfabeto = new HashSet<>();

        
        System.out.println("");
        System.out.println("");
        System.out.println("A vamos ver o tamanho das letras do alfabeto:");
        
        for (char letras = 0; letras <= 26; letras++) {
            System.out.println("Informe o conjunto  de letras ,que deseja ver o tamanho:");
        }
        
        alfabeto.add('a');
        alfabeto.add('b');
        alfabeto.add('c');
        alfabeto.add('d');
        alfabeto.add('e');
        alfabeto.add('f');
        alfabeto.add('g');
        alfabeto.add('h');
        
       
            
        }
        

    }

