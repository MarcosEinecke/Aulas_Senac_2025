package Aula_1.Exercicios_2;

import java.util.Scanner;

/**
 *
 * @author MarocsEinecke
 */
public class Exercicio4_Converter_Celsius {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite uma temperatura em °C para ser convertida");
        double temp = teclado.nextDouble();
        double F = (temp * 9 / 5 + 32);
        System.out.println(temp + "°C = " + F + "°F");

    }

}
