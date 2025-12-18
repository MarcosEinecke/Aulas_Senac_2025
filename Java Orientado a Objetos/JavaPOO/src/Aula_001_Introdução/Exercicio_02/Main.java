/**
 *
 * @Marcos_Einecke
 *
 * 2. Crie uma classe ContaBancaria com os atributos numeroConta (String), saldo
 *(double) e titular (String). Crie os métodos depositar(double valor) e sacar(double
 *valor) que atualizam o saldo da conta.
 *
 *
 */
package Aula_001_Introdução.Exercicio_02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroConta = 1234;
        System.out.println("CONTA BANCARIA ");
        System.out.println("");
        System.out.println("");

        System.out.println("Digite o número da sua conta:");
        numeroConta = sc.nextInt();

        while (numeroConta != 1234) {
            System.out.println(" Conta inválida. Tente novamente. ");
            System.out.println("");
            System.out.println("");
            System.out.println(" Digite o número da sua conta: ");
            numeroConta = sc.nextInt();
            System.out.println("");
            System.out.println("");
        }

        System.out.println("SEJA BEM VINDO DE VOLTA!");

    }

}
