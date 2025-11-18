/**
 *
 * @Marcos_Einecke
 * 
 * 9. Crie uma classe Produto com os atributos nome (String), preco (double) e 
 *quantidadeEmEstoque (int). Crie os métodos vender(int quantidade) e 
 *reporEstoque(int quantidade) que atualizam a quantidade em estoque do produto. 
 * 
 * 
 */



package Aula_01_Exercicio_09;
public class Main {
    public static void main(String[] args) {
        
        Produto produto1 = new Produto();
        produto1.nome = "Camiseta";
        produto1.preco = 39.90;
        produto1.quantidadeEmEstoque = 50;
        produto1.vender(10);
       // produto1.reportEstoque(20);
                
                
                
                
    }
    
}
