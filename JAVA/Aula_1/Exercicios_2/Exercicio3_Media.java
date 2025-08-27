package Aula_1.Exercicios_2;

import java.util.Scanner;

/**
 *
 * @author MarcosEinecke
 */
public class Exercicio3_Media {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        double num1 = teclado.nextDouble();
        System.out.println("Digite o segundo número");
        double num2 = teclado.nextDouble();
        System.out.println("Digite o terceiro número");
        double num3 = teclado.nextDouble();

        double media = (num1 + num2 + num3) / 3;
        System.out.println("a média desses números é: " + media);
    }

}
