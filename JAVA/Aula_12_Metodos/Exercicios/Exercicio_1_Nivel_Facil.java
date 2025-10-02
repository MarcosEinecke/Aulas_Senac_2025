/**
 *
 * @author Marcos Einecke
 *
 * 1. Crie um método que receba dois números inteiros como parâmetros e retorne a
 * soma deles. Implemente um programa que utilize este método para somar dois
 * números fornecidos pelo usuário.
 *
 */
package Aula_12_Metodos.Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_1_Nivel_Facil {

    //Inicio
    public static void Inicio() {
        System.out.println("SEJA BEM VINDO AO SOMADOR!");
        System.out.println("Informe 2 número inteiro e some eles:");
    }

    //Método para Scanner Números 
    public static ArrayList<Integer> ScannnerNumeros() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i < 3; i++) {
            System.out.println("Infome " + i + "º número :");
            int numero = sc.nextInt();
            System.out.println("");

            numeros.add(numero);
        }
        return numeros;
    }

    //Método de Calcular Soma
    public static double CalcularSoma(ArrayList<Integer> numeros) {
        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        return soma;

    }

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("");

        Inicio();

        System.out.println("");
        System.out.println("");

        ArrayList numeros = ScannnerNumeros();

        double somaTotal = CalcularSoma(numeros);
        System.out.println("");
        System.out.println("");

        System.out.println("Aqui está a resposta da soma " + somaTotal);
        System.out.println("");
        System.out.println("");

    }

}
