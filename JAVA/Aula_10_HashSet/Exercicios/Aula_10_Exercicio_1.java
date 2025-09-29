/** 
 * @author Marcos
 * 
 * 1. Crie um HashSet de números inteiros e adicione os números de 1 a 10. 
 * Verifique se o número 5 está presente no conjunto. 
 * 
 */

package Aula_10_HashSet.Exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Aula_10_Exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resp;
        Set<String> numeros = new HashSet<>();
        
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
        numeros.add("4");
        numeros.add("5");
        numeros.add("6");
        numeros.add("7");
        numeros.add("8");
        numeros.add("9");
        numeros.add("10");
        
        
        System.out.println("");
        System.out.println("");
        
        do {
        
        System.out.println("Digite um número e verifique se ele consta no conjunto: ");
        String busca = sc.nextLine();
        
        if (numeros.contains(busca)) {
            System.out.println("O número "+busca+ " faz parte do conjunto.");
        }else{
            System.out.println("O número "+busca+ " não faz parte do conjunto.");
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Esses são os números do conjunto:");
        System.out.println("");
        
        for (String conjunto : numeros) {
            System.out.println(conjunto);
            
        }
        
        System.out.println("");
        System.out.println("");
        
            System.out.println("Caso queira recomeçar escreva (iniio) para finalizar o programa (sair) :");
           resp = sc.nextLine();
            
        } while (resp == "sair");
        
    }
    
}
