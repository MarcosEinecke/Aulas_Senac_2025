package Aula_3.Exercicios_Sem_Calculos;

import java.util.Scanner;

/**
 * @author TI 4. Verificador de Vogais: Crie um programa que leia uma palavra e
 * informe se ela contém pelo menos uma vogal (a, e, i, o, u).
 *
 */
public class Exercicio4_Vogal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("           CAÇA VOGAL             ");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(" Informe uma palavra:");
        String palavra = teclado.nextLine();
        if (palavra.contains("a") || palavra.contains("e") || palavra.contains("i") || palavra.contains("o") || palavra.contains("u")){ 

            System.out.println("A sua palavra contém pelo menos uma vogal ");
        }else {
            System.out.println("A sua palavra não contém vogais.");
            System.out.println("");
            System.out.println("");
        }
    
}
}