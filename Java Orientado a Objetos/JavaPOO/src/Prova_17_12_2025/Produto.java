
package Prova_17_12_2025;

/**
 *
 * @author Marcos Einecke
 */



public class Produto {
    
    private String nome,codigo;
    protected double preco;

    public Produto(String nome, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if( preco >= 0) {
             this.preco = preco;
        }else{
            System.out.println(" Valor inválido.Tente novamente.");
        }
        
       
        
        
        
    }

    @Override
    public String toString() {
        return "\nProduto: "  + nome + "\nCodigo: " + codigo + "\nPreço: " + preco ;
    }
    
    
    
    
    
    
    
    
    
    
}
