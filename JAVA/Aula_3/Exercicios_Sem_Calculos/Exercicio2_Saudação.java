package Aula_3.Exercicios_Sem_Calculos;

import java.util.Scanner;

/**
 * @author TI 2. Saudação Personalizada: Crie um programa que pergunte o nome e
 * o turno em que a pessoa estuda (Manhã, Tarde ou Noite) e exiba uma saudação
 * personalizada. DICA: "if (turno.equalsIgnoreCase)"
 */
public class Exercicio2_Saudação {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("      EFETUE O LOGIN PARA ACESSAR              ");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(" Qual seu nome? ");
        String nome = teclado.nextLine();
        System.out.println("");
        System.out.println("");
        System.out.println("Qual seu turno ?");
        String turno = teclado.nextLine();
        System.out.println("");
        System.out.println("");

        if (turno.equalsIgnoreCase("manha")) {
            System.out.println("Bom dia " + nome);
        }
        if (turno.equalsIgnoreCase("tarde")) {
            System.out.println("Boa tarde " + nome);
        }
        if (turno.equalsIgnoreCase("noite")) {
            System.out.println("Boa noite " + nome);
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("       VOCÊ ESTÁ LOGADO ");
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
    }

}
