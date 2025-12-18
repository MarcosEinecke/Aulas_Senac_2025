/**
 *
 * @Marcos_Einecke
 * 
 */




package Aula_001_Introdução.Exercicio_09;

public class Produto {
    String nome;
    double preco;
    int quantidadeEmEstoque;
    
    void vender (int quantidade){
        if(quantidade <= quantidadeEmEstoque){
            quantidadeEmEstoque -= quantidade;
            System.out.println("Venda de " +quantidade+ " unidade de  "+nome+ " realizade com sucesso.");
        }else {
            System.out.println("Estoque insuficiente para a venda.");
        }
        
    }
    
    
    void reporEstoque (int quantidade) {
        quantidadeEmEstoque += quantidade;
        System.out.println(" Estoque de "+ nome + " resposto com "+ quantidade + " unidades");
    }
    
    
}
