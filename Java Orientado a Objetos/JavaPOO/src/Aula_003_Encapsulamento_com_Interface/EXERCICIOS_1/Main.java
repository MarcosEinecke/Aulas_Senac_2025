/**
 *
 * @author Marcos Einecke
 *
 * 1. Conta Bancária: Crie uma interface Conta com os métodos
 * depositar(double valor) e sacar(double valor). Implemente essa interface em
 * umaclasse ContaCorrente.
 *
 *
 */
package Aula_003_Encapsulamento_com_Interface.EXERCICIOS_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean executando = true;

        while (executando) {

            System.out.println("\n --   SEJA BEM VINDO    --");
            System.out.println(" --         AO           --");
            System.out.println(" --   CAIXA ELETRÔNICO  --");
            System.out.println("");
            System.out.println("");
            System.out.println("");

            //limpaTela();
            ContaCorrente c1 = new ContaCorrente();

            System.out.println("1. EXTRATO");
            System.out.println("2. DEPOSITAR");
            System.out.println("3. SACAR");
            System.out.println("0. SAIR ");
            int op = sc.nextInt();
           // double saldo = 0;

            //double valorSacar;

            switch (op) {

                case 1:
                    System.out.println("SEU SALDO É: ");
                     c1.getExtrato();
                       

                    break;

                case 2:

                    System.out.println("QUANTO VOCÊ QUER DEPOSITAR? ");
                    c1.depositar(sc.nextDouble());
                    
                    break;

                case 3:

                    break;

                case 4:
                    System.out.println("QUANTO VOCÊ SACAR?");
                   // valorSacar = sc.nextDouble();
                    c1.getSacar();
                   // saldo -= valorSacar;
                    break;
            }

        }

    }

    public static void limpaTela() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }

}
