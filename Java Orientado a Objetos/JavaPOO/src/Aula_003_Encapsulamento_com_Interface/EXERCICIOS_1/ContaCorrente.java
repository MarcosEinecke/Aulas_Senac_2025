/**
 *
 * @author Marcos Einecke
 * 
 * 
 */


package Aula_003_Encapsulamento_com_Interface.EXERCICIOS_1;
public class ContaCorrente implements Conta {
    
    private double depositar;
    private double sacar;
    private double extrato;
   // private double saldo;
    
    //Contrutor 

    public ContaCorrente() {
        this.depositar = depositar;
        this.sacar = sacar;
        this.extrato = extrato;
        //this.saldo = saldo;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    public double getExtrato() {
        return extrato;
    }
    
//    public double getSaldo() {
//        return extrato;
//    }

    public void setExtrato(double extrato) {
        this.extrato = extrato;
    }

//    @Override
//    public void saldo() {
//        System.out.println("Seu saldo é: " + extrato);               
//        
//         }

    @Override
    public void sacar(double valor) {
        if (this.getExtrato() < valor) {
            System.out.println("Saldo insuficiente.");
            }else{
            valor -= this.getExtrato();
        }
    }

    @Override
    public void depositar(double valor ) {
       extrato += valor;
            System.out.println("Valor depositado: "+ extrato);
        
    }

    @Override
    public void saldo() {
       System.out.println("Seu saldo é: " + extrato);               
    }
    

 
    
}
