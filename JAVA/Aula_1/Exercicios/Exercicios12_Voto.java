package Aula_1.Exercicios;

import java.util.Scanner;

/**
 *
 * @author MarcosEinecke
 */
public class Exercicios12_Voto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual sua idade");
        int id = teclado.nextInt();

        if (id >= 18) {
            System.out.println("Voce pode votar");

        } else {
            System.out.println("Voce nao pode votar");
        }

    }

}
