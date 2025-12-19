/**
 *
 * @author Marcos Einecke
 */

package Aula_003_Encapsulamento_com_Interface.EXERCICIOS_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        
        List<Integer> numeros = Arrays.asList(5, 2, 9, 1, 7);

        
        System.out.println("Lista original: " + numeros);

        
        Ordenacao<Integer> crescente = new OrdenacaoCrescente();
        crescente.ordenar(new ArrayList<>(numeros));

      
        Ordenacao<Integer> decrescente = new OrdenacaoDecrescente();
        decrescente.ordenar(new ArrayList<>(numeros));       
    } 
}
