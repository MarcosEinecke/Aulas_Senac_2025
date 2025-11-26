/**
 *
 * @author Marcos Einecke
 * 
 * 2. Classe Conta Bancária: Crie uma classe ContaBancaria com os atributos
 numeroConta, saldo e titular. Crie um construtor, métodos getters e setters
 para saldo, e um métododepositar(double valor) que adiciona o valor ao
 saldo.
 * 
 * 
 */

package Aula_002_Get_Set_Contruct.Exercicio_02;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ContaBancaria conta1 = new ContaBancaria(1234,"Marcos",0);
         
        System.out.println("SEJA BEM VINDO "+conta1.getTitular());
        System.out.println("\nSALDO ATUAL: "+conta1.getSaldo());
        
        System.out.println("Qunto você gostaria depositar hoje? ");
        double valor = sc.nextDouble();
        
        conta1.depositar(valor);
        
        System.out.println("\nSeu novo saldo é "+conta1.getSaldo());
        
        
    }
    
}

