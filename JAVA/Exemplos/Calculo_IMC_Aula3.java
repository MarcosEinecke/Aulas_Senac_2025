package Exemplos;

import java.util.Scanner;

/**
 *
 * @author MarcosEinecke
 */
public class Calculo_IMC_Aula3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual é seu peso(KG): ");
        double massa = teclado.nextDouble();
        System.out.println("Altura(m)");
        double altura = teclado.nextDouble();
        double imc = massa / (altura * altura);
        System.out.printf("IMC: %.2f%n", imc);
        if (imc < 17) {
            System.out.println("Muito abaixo do peso");
        } else if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (25 >= imc) {
            System.out.println("Peso ideal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Obesidade");
        } else if (imc < 40) {

            System.out.println("Obesidade Severa");

        } else {
            System.out.println("Obesidade Mórbida");

        }
    }
}
