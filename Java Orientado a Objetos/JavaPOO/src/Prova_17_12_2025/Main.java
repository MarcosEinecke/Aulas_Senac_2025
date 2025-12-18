/**
 *
 * @author Marcos Einecke
 * 
 */


package Prova_17_12_2025;

import Limpa_Tela.LimpaTela;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int op = 0;
        string desbug;
        
        Produto p1 = new Produto("Pastel","Produto 1",10);
        Produto p2 = new Produto("Pizza","Produto 2",12);
        Produto p3 = new Produto("Refrigerante","Bebida 1",6);
        Vendedor v = new Vendedor("Rangel", 01);
        Vendedor v2 = new Vendedor ("Irmão do Rangel",02);
        
        
        
        
        
        
        
        do {
        
        System.out.println("*************************************************");
        System.out.println("");
        System.out.println("*               VENDAS RANGEL                   *");
        System.out.println("");
        System.out.println("*************************************************");
        System.out.println("*                                               *");
        System.out.println("*                                               *");
        System.out.println("*                                               *");
        System.out.println("* 1.COMPRAR PRODUTOS                            *");
        System.out.println("* 2.PRODUTOS E VENDEDORES                       *");
        System.out.println("* 3.SAIR DO SISTEMA                             *");
        System.out.println("*                                               *");
        System.out.println("*************************************************");
        op = sc.nextInt();
        sc.nextLine();
        LimpaTela.limpaTela();
       
        
        switch (op){
            case 1:
                
        System.out.println("*************************************************");
        System.out.println("");
        System.out.println("*               VENDAS RANGEL                   *");
        System.out.println("");
        System.out.println("*************************************************");
        System.out.println("*                                               *");        
        System.out.println("*                  COMBOS                       *");       
        System.out.println("*                                               *");               
        System.out.println(" 1. " + p1.getNome() + "   +  " + p3.getNome() + 
                " Total = " + (p1.getPreco() + p3.getPreco())+ 
                "Cumpom: "+ ProdutoPromocional.aplicarPromocao() + " comprar com  " + v.getNome()+ "   "); 
        System.out.println("");
        System.out.println("* 1. " + p2.getNome() + "   +  " + p3.getNome() + 
                " Total = " + (p2.getPreco() + p3.getPreco())+ 
                "Cumpom: "+ ProdutoPromocional.aplicarPromocao() + " comprar com  " + v2.getNome()+ "   ");  
        System.out.println("*                                               *");        
        System.out.println("*                                               *");       
        System.out.println("*                                               *");        
        
                             
                
                
                break;
                
            case 2:
                
        System.out.println("*************************************************");
        System.out.println("");
        System.out.println("*               VENDAS RANGEL                   *");
        System.out.println("");
        System.out.println("*************************************************");
        System.out.println("*                                               *");        
        System.out.println("*           PRODUTOS E VENDEDORES               *");       
        System.out.println("*                                               *");                
        System.out.println("*                                               *");    
        System.out.println("PRODUTOS: ");
        System.out.println( p1.nome +p1.codigo +p1.preco);
        System.out.println( p2.nome +p2.codigo +p2.preco);
        System.out.println( p3.nome +p3.codigo +p3.preco);
        System.out.println("*                                               *");                
        System.out.println("*                                               *");               
        System.out.println("VENDEDORES: ");        
        System.out.println( v.nome +v1.id);
        System.out.println( v2.nome +v2.id);       
        System.out.println("*                                               *");                
        System.out.println("*                                               *"); 
        
        
                break;
                
                
            case 3:
                
        System.out.println("*                                               *");                
        System.out.println("*                                               *");    
        System.out.println("*              SAINDO.....                      *");                
        System.out.println("*                                               *");           
                break;
                
            default : 
                
                System.out.println("Opção inválida");
            break;
            
            
        }
        
        
       do (op = 3) }
        
        
        
        
        
//        System.out.println("*************************************************");
//        System.out.println("*                                               *");
//        System.out.println("*                                               *");
//        System.out.println("*                                               *");
//        System.out.println("*                                               *");
//        
//        
        
        
        
    }
    
}
