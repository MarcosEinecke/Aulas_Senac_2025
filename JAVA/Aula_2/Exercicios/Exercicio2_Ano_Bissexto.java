package main.JAVA.Aula_2.Exercicios;

/*Exercício 2 – Verificar se um ano é bissexto
Utiliza boolean para aplicar a regra de ano bissexto. */


import java.util.Scanner;

public class Exercicio2_Ano_Bissexto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Verificador de ano bissexto");
        System.out.println();
        System.out.println();
        System.out.println("Informe o ano que deseja verificar: ");
        int ano = teclado.nextInt();
        System.out.println();
        System.out.println();

        boolean isBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);  
        System.out.println("O ano " + ano + " e bissexto? " + isBissexto);
        System.out.println();
        System.out.println();
        teclado.close();

    

    }

}
