
package Aula_1;

import java.util.Scanner;

public class Exercicio1_Salario_dos_Funcionarios {
   
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in); 
        System.out.println("****************************************************************************"); 
        System.out.println("****************************************************************************");
        System.out.println("                        CADASTRE SEU SALARIO AQUI                           ");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        
        
        System.out.println("INFORME SEU NOME:");
        String nome = teclado.nextLine();
        System.out.println("INFORME SEU SALARIO:");
        double salario = teclado.nextDouble();
        
        
        System.out.println("****************************************************************************"); 
        System.out.println("****************************************************************************");
        System.out.println("                  CADRASTRO REALIZADO COM SUCESSO                           ");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        
        
        
        
        System.out.println(nome + " SEU SALARIO E "+ salario);
        
        
        
               
    }
}
