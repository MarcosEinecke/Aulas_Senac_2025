/**
 *
 * @author Marcos Einecke
 */

package Aula_003_Encapsulamento_com_Interface.EXERCICIOS_10;

import java.util.Collections;
import java.util.List;


public class OrdenacaoCrescente implements Ordenacao{

    @Override
    public void ordenar(List lista) {
        
        Collections.sort(lista);
        System.out.println("Lista ordenada em ordem crescente: "+lista);       
    }    
}
