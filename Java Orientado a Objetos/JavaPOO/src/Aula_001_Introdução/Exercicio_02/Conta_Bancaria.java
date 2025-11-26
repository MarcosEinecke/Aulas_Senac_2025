/** *
 * @Marcos_Einecke
 *
 *
 */
package Aula_001_Introdução.Exercicio_02;

public class Conta_Bancaria {

    String numeroConta;
    double saldo;
    String titular;

    public void depositar(double valor) {

        if (valor > 0) {
            saldo += valor;
        }

    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {

            saldo = -valor;

        }

    }
    
    
    
    public String numeroConta(){
        
    return numeroConta;
            
    }
    
    
    
    public String titular(){
        return titular;
    }
    
    
    
    
}
