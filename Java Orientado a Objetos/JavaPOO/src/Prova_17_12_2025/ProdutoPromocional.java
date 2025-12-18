package Prova_17_12_2025;
public class ProdutoPromocional extends Produto implements Promocional {

    public ProdutoPromocional(String nome, String codigo, double preco) {
        super(nome, codigo, preco);
    }

  
        
    
    
    @Override
    public String aplicarPromocao() {
             if (preco > 100){
            System.out.println("Desconto de 10% aplicado");
        }else{
            System.out.println("Sem desconto disponível.");
        }
        
    }return    
    

    