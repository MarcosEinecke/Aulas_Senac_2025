package Aula_1.Exercicios;

import java.util.Scanner;

/**
 *
 * @author MarcosEinecke
 */
public class Exercicios11_Multa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a velocidade do carro?");
        double vel = teclado.nextDouble();

        if (vel > 90) {
            double multa = (vel * 5);

            System.out.println("Você foi multado! Precisa pagar o valor de: R$ " + multa);

        } else {
            System.out.println("Você não foi multado");

        }
    }

}
