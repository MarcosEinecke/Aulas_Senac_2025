/**
 *
 * @author Marcos Einecke
 */


package Prova_17_12_2025;
public class Vendedor extends Usuario {
    
    private double metaVendas;

    public Vendedor(String nome, int id,double metaVendas) {
        super(nome, id);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }
    
    
    
       @Override
    public String toString() {
        return "\nProduto: "  + nome + "\nCodigo: " + id ;
    }
    
    
    
    
}
