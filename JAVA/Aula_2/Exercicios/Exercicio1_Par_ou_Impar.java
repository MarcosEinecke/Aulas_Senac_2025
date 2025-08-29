package main.JAVA.Aula_2.Exercicios;

import java.util.Scanner; // Importação correta

/* @author MarcosEinecke */

/*Exercício 1 – Verificar se um número é par
Utiliza boolean para determinar se um número inteiro é par. */

public class Exercicio1_Par_ou_Impar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Nome correto da classe

        System.out
                .println("*******************************************************************************************");
        System.out
                .println("*******************************************************************************************");
        System.out
                .println("*******************************************************************************************");
        System.out
                .println(
                        "*****                  VAMOS DESCOMBRIR SE O NUMERO E PAR OU IMPAR                     *****");
        System.out
                .println(
                        "********************************************************************************************");
        System.out
                .println(
                        "********************************************************************************************");
        System.out
                .println(
                        "********************************************************************************************");
        System.out
                .println(
                        "********************************************************************************************");
        System.out
                .println(
                        "********************************************************************************************");
        System.out
                .println(
                        "********************************************************************************************");
        System.out
                .println(
                        "********************************************************************************************");
        System.out
                .println(
                        "*****  Informe um numero :                                                              *****");

        int numero = teclado.nextInt();

        boolean par = (numero % 2) == 0;

        if (par) {
            System.out.println("O numero " + numero + " e PAR.");
        } else {
            System.out.println("O numero " + numero + " e IMPAR.");
        }

        teclado.close(); // Boa prática: fechar o Scanner
    }
}
