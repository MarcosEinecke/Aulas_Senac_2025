/**
 *
 * @author Marcos Einecke
 */


package Aula_002_Get_Set_Contruct.Exercicio_02;
public class ContaBancaria {
    
    
    private int numeroConta;
    private double saldo;
    private String titular;

    public ContaBancaria(int numeroConta, String titular,double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    
    
       public void depositar(double valor) {

        if (valor > 0) {
            this.saldo += valor;
            System.out.println("DEPOSITO REALIZADO COM SUCESSO ");
        }

    }

    
    
    
    
    
}
