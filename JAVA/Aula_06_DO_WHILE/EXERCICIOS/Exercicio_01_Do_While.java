/**
 *
 * @author Marcos Einecke
 * 
 * Exercício 1: Soma de números até o usuário digitar 0
 *Criar um algoritmo que leia vários números inteiros e calcule a soma deles, parando quando o usuário digitar o número 0.
 * 
 */

package Aula_06_DO_WHILE.EXERCICIOS;
public class Exercicio_01_Do_While {
    public static void main(String[] args) {
        System.out.println("SOMA DE NÚMEROS (DIGITE 0 PARA PARAR)");
        System.out.println("=====================================");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int soma = 0;
        int numero;
        do {
            System.out.print("Digite um número inteiro (0 para parar): ");
            numero = scanner.nextInt();
            soma += numero;
        } while (numero != 0);
        System.out.println("A soma dos números digitados é: " + soma);
    }
    
}
