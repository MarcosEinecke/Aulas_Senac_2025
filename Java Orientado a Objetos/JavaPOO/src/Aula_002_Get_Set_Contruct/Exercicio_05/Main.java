/**
 *
 * @author Marcos Einecke
 * 
 * 5. Classe Produto: Crie uma classe Produto com os atributos nome, preco e
quantidadeEmEstoque. Crie um construtor, métodos getters e setters, e um
método comprar(int quantidade) que diminui a quantidade em estoque se
houver disponibilidade.
 * 
 * 
 */

package Aula_002_Get_Set_Contruct.Exercicio_05;
public class Main {

    public static void main(String[] args) {
        
        // Criando um novo produto
        Produto produto1 = new Produto("Notebook", 3500.00, 10);
        
        // Exibindo informações iniciais do produto
        System.out.println("=== Informações do Produto ===");
        System.out.println(produto1.toString());
        System.out.println();
        
        // Testando método comprar
        System.out.println("=== Operação: Comprar 3 unidades ===");
        produto1.comprar(3);
        System.out.println(produto1.toString());
        System.out.println();
        
        // Tentando comprar mais unidades do que em estoque (deve falhar)
        System.out.println("=== Tentativa de comprar 8 unidades ===");
        produto1.comprar(8);
    }
    
    
    
    
}
