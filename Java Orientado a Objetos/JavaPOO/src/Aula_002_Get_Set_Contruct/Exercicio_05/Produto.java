/**
 *
 * @author Marcos Einecke
 * 5. Classe Produto: Crie uma classe Produto com os atributos nome, preco e
quantidadeEmEstoque. Crie um construtor, métodos getters e setters, e um
método comprar(int quantidade) que diminui a quantidade em estoque se
houver disponibilidade.
 * 
 */

package Aula_002_Get_Set_Contruct.Exercicio_05;
public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Método comprar conforme requisito
    public void comprar(int quantidade) {
        if (quantidade <= this.quantidadeEmEstoque) {
            this.quantidadeEmEstoque -= quantidade;
            System.out.println("Compra de " + quantidade + " unidades do produto '" + this.nome + "' realizada com sucesso!");
        } else {
            System.out.println("Compra falhou! Quantidade em estoque insuficiente para o produto '" + this.nome + "'.");
        }
    }

    
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                '}';
    }


    
    
}
