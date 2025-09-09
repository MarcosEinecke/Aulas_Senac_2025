package Exemplos;

import java.util.Scanner;

/**
 *
 * @author MarcosEinecke
 */
public class Viagem_Aula3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quanto de dinheiro você tem?");
        double dinheiro = teclado.nextDouble();
        if (dinheiro >= 10000) {
            System.out.println("Partin viagem");

        } else {
            System.out.println("Não vai ter rolê");
        }

    }

}
