/**
 *
 * @author Marcos Einecke
 */

package Aula_003_Encapsulamento_com_Interface.EXERCICIOS_07;
public class Dinheiro implements FormaPagamento{

    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado em dinheiro.");
    }
    
}
