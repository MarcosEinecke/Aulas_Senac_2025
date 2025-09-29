/*
 * @author Marcos Einecke
*
*
 */
package Aula_12_Metodos;

import java.util.Scanner;

public class Exemplo_CoversorTemperatura {

    //Método para coverter Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("");

        //Solicite ao usuário a temperatura em Celsius
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        //Converte a temperatura para Fahrenheit
        double fah = celsiusParaFahrenheit(celsius);

        //Exebir o resultado
        System.out.println(celsius + " °C equivale a " + fah + " °F");
    }

}
