/**
 *
 * @author Marcos Einecke
 */

package Prova_17_12_2025;
public class VendedorPromocional extends Vendedor implements Promocional{

    public VendedorPromocional(String nome, int id) {
        super(nome, id);
    }



    @Override
    public void setMetaVendas(double metaVendas) {
    }

    @Override
    public double getMetaVendas() {
    }

                       
        
    @Override
    public String aplicarPromocao() {               
        System.out.println("Bônus de meta ativado para o vendedor.");
    } return  
    
    
    
    
}
