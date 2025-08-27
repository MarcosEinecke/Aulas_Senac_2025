package Aula_1.Exercicios;

import java.util.Scanner;

/**
 *
 * @author MarcosEinecke
 */
public class Exercicios10_Salario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos dias o cupinhca trabalhou?");
        double dias = teclado.nextDouble();

        double pordia = 25 * 8;

        System.out.println("O Cupincha ganhou:" + (dias * pordia));

    }

}
