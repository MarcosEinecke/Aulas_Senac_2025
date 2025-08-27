package Aula_1.Exercicios;

import java.util.Scanner;

/**
 *
 * @author MarcosEinekce
 */
public class Exercicio6_Pintando_Parede {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a largura da parede?");
        double larg = teclado.nextDouble();
        System.out.println("Qual a altura da parede?");
        double alt = teclado.nextDouble();

        System.out.println("A mamãe vai precisar dessa quantidade de litros de tinta:" + (larg * alt / 2));

    }

}
