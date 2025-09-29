/**
 *
 * @author Marcos Einecke
 */
package Aula_12_Metodos;

import java.util.Scanner;

public class Exemplo_Conta_Bancaria {

    private double saldo;

    //Construtor 
    public Exemplo_Conta_Bancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    //Método para depositar dinheiro na conta 
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido");
        }
    }

    //Método para sacar dinheiro da conta
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");

        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    //Método para obter saldo atual da conta 
    public double obterSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Criar uma conta com saldo inicial R$ 1.000,00
        Exemplo_Conta_Bancaria minhaConta = new Exemplo_Conta_Bancaria(1000.00);

        //Exibir o saldo inicial
        System.out.println("Saldo inicial: R$ " + minhaConta.obterSaldo());

        //Depositar 500 reias
        System.out.println("Digite um valor para depósito: R$: ");
        double deposito = sc.nextDouble();
        minhaConta.depositar(deposito);

        //Obter Saldo após depósito
        System.out.println("Saldo após o deposito: R$ " + minhaConta.obterSaldo());

        //Sacar R$ 200
        System.out.println("Digite o valor para saque: R$: ");
        double saque1 = sc.nextDouble();
        minhaConta.sacar(saque1);

        //Obter Saldo após saque
        System.out.println("Saldo após o saque: R$ " + minhaConta.obterSaldo());

//        //Sacar um valor maior que o saldo
//        minhaConta.sacar(5000);

        //Obter Saldo após saque maior que o saldo
        System.out.println("Saldo final: R$ " + minhaConta.obterSaldo());

    }
}
