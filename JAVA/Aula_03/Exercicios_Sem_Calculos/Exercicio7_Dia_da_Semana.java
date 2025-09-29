/*
 * @uthor: Marcos Einecke
 * 7. Verificador de Dia da Semana
Enunciado: Faça um programa que leia um dia da semana (ex.: "segunda") e informe se é um dia útil ou de fim de semana.
DICA: "if (dia.equals("segunda") ||"
 * 
 */

package Aula_03.Exercicios_Sem_Calculos;

import java.util.Scanner;

public class Exercicio7_Dia_da_Semana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String dia;

        System.out.println();
        System.out.println();
        System.out.println("--- VERIFICADOR DE DIA DA SEMANA ---");
        System.out.println();
        System.out.println();
        System.out.print("Digite um dia da semana (ex.: segunda): ");
        dia = teclado.nextLine().toLowerCase(); // Converte para minúsculas para facilitar a comparação
        System.out.println();
        System.out.println();

        if (dia.equals("segunda") || dia.equals("terça") || dia.equals("quarta") || dia.equals("quinta")
                || dia.equals("sexta")) {
            System.out.println(dia.substring(0, 1).toUpperCase() + dia.substring(1) + " é um dia útil.");
        } else if (dia.equals("sábado") || dia.equals("domingo")) {
            System.out.println(dia.substring(0, 1).toUpperCase() + dia.substring(1) + " é um fim de semana.");
        } else {
            System.out.println("Entrada inválida. Por favor, digite um dia válido da semana.");
        }
        System.out.println();
        System.out.println();

        teclado.close();
    }

}
