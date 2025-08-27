/*
5. Conversor de Moedas: Imagine que você está indo viajar para os Estados Unidos e precisa converter seus reais em dólares. 
Crie um programa que pergunte quantos reais você tem na carteira e mostre quantos dólares você poderá comprar,considerando a cotação do dólar a R$ 5,45. 
Formate a saída para mostrar o valor em dólares com duas casas decimais.
 */

import java.util.Scanner;

public class Exercicio5_Conversor_de_Moedas {

    public static void main(String[] args) {
        /*
         * VARIAVEIS
         */

        double valor;
        double dolar;

        Scanner teclado = new Scanner(System.in);

        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("                        CONVERSOR DE REAL PARA DOLAR:                       ");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("");
        System.out.println("");

        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("                INFORME O VALOR QUE DESEJA CONVERTER:(reais)                ");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        valor = teclado.nextDouble();
        System.out.println("");
        System.out.println("");

    dolar = valor / 5.45;

        System.out.println("");
        System.out.println("");

        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("                AQUI ESTA O VALOR  EM REAIS E DOLAR:                        ");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
    System.out.printf("R$    %.2f%n", valor);
    System.out.printf("U$    %.2f%n", dolar);
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");

    }
}
