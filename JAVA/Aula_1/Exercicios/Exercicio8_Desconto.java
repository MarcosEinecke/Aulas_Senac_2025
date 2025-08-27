package Aula_1.Exercicios;

import java.util.Scanner;

/**
 *
 * @author MarcosEinecke
 */
public class Exercicio8_Desconto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("qual o valor do produto?");
        double num = teclado.nextDouble();
        System.out.println("com o nosso desconto de 5% ficou um total de:" + (num / 0.05) + " R$");

    }

}
