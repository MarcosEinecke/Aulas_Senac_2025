
/** 
 * @author Marcos Einecke
 * 
 * 3. Encontrar o maior número em um array de inteiros
 * 
 */


package Aula_09_For_Each_HashSet.Exercicios;

import java.util.ArrayList;
import java.util.Scanner;


public class Nivel_Facil_3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        
       ArrayList<Integer> listaDeNumeros = new ArrayList<>();
       
        listaDeNumeros.add(1);
        listaDeNumeros.add(2);
        listaDeNumeros.add(3);
        listaDeNumeros.add(4);
        listaDeNumeros.add(5);
        listaDeNumeros.add(10);
        
        int maior = 0;
        for( int numero : listaDeNumeros ){
       if (numero > maior) {
           maior = numero;
       }
       
    }
        System.out.println("O maior número é "+ maior);
    }
}
