/**
 *
 * @author Marcos Einecke
 * 
 *  14. Classe Casa: Crie uma classe Casa com os atributos numero, cor e
 *proprietario (objeto da classe Pessoa). Crie um construtor e métodos getters.
 * 
 * 
 */


package Aula_002_Get_Set_Contruct.Exercicio_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do proprietário");
        String nomeProprietario = sc.nextLine();
        
        
        System.out.println("Digite o número da casa: ");
        int numeroCasa = sc.nextInt();
        sc.nextLine();
        
        
        System.out.println("Digite a cor da casa: ");
        String corCasa = sc.nextLine();
        
        
        Pessoa p1 = new Pessoa(nomeProprietario);
        Casa c1 = new Casa(numeroCasa,corCasa,p1);
        
        System.out.println("\n --- Dados da Casa --- ");
        System.out.println("Número da casa: "+c1.getNumero());
        System.out.println("Cor da casa: "+c1.getCor());
        System.out.println("Proprietário: "+c1.getProprietario().getNome());
       
        
        
        
        
    }
    
}
