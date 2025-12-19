/**
 *
 * @author Marcos Einecke
 */

package Aula_003_Encapsulamento_com_Interface.EXERCICIOS_10;

import java.util.Collections;
import java.util.List;



public class OrdenacaoDecrescente implements Ordenacao{

    @Override
    public void ordenar(List lista) {
        
        Collections.sort(lista, Collections.reverseOrder());
        System.out.println("Lista ordenada em ordem decrescente: "+lista);
        
    }  
}
