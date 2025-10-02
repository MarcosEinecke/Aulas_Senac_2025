package Aula_12_Metodos.Exercicios;

import java.util.Scanner;

/**
 * 3. Crie um método que receba um número inteiro positivo e retorne o fatorial
 * desse número. O fatorial de um número n é o produto de todos os números
 * inteiros positivos menores ou iguais a n.
 */
public class Execicio_3_Nivel_Facil {

    // Método de apresentação
    public static void Inicio() {
        System.out.println();
        System.out.println("FATORIAL DE NÚMEROS POSITIVOS");
        System.out.println();
    }

    // Método para ler o número
    public static int lerNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número inteiro positivo: ");
        int numero = sc.nextInt();
        return numero;
    }

    // Método para calcular o fatorial
    public static long Calculo(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método principal
    public static void main(String[] args) {
        Inicio();

        int numero = lerNumero();          
        long resultado = Calculo(numero);  

        System.out.println();
        System.out.println("O fatorial de " + numero + " é: " + resultado);
        System.out.println();
    }
}