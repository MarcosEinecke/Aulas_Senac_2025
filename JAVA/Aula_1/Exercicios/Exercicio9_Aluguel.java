package Aula_1.Exercicios;

import java.util.Scanner;

/**
 *
 * @author MarcosEinecke
 */
public class Exercicio9_Aluguel {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos KM foram percorridos?");
        double km = teclado.nextDouble();
        System.out.println("Quantos dias foram usados?");
        double dia = teclado.nextDouble();
        System.out.println("foram: R$ " + (dia * 90 + km * 0.90));

    }

}
