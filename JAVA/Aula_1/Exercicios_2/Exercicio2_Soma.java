package Aula_1.Exercicios_2;

import java.util.Scanner;

/**
 *
 * @author MarcosEinecke
 */
public class Exercicio2_Soma {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = teclado.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = teclado.nextInt();
        System.out.println("Resultado: " + (num1 + num2));

    }

}
