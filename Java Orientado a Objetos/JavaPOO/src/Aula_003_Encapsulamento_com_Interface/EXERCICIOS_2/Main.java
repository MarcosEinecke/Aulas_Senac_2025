/**
 *
 * @author Marcos Einecke
 * 
 * Animal: Crie uma interface Animal com o método emitirSom(). Implemente
essa interface em classes como Cachorro, Gato e Passaro, cada uma com
sua própria implementação de emitirSom().
 * 
 * 
 * 
 */


package Aula_003_Encapsulamento_com_Interface.EXERCICIOS_2;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        Gato g1 = new Gato (String nomeGato,int idadeGato,String especieGato);
        Passaro p1 =  new Passaro (String nomePassaro,int idadePassaro,String especiePassaro);
        Cachorro c1 = new Cachorro (String nomeCachorro,int idadeCachorro,String especieCachorro);
        
        
        System.out.println(" DESCOBRINDO SONS DOS ANIMAL ");
        System.out.println("");
        System.out.println("");
        
        
        System.out.println("\nQual o nem do seu gato?");
        String nomeGato = sc.nextLine;
        
        System.out.println("\nQual a idade do seu gato?");
        int idadeGato = sc.nextInt();
        sc.nextLine();
        
        System.out.println("\nQual a especie do seu gato?");
        String especieGato = sc.nextLine();
        
        
        System.out.println("\nDADOS DO SEU GATO:");
         System.out.println("\n"+nomeGato +
                             "\n"+idadeGato+
                             "\n"+especieGato+
                              "\n Som carcteristico: " + g1.emitirSom();   
       
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
}
