/* 
 * @author: Marcos Einecke
 * 
 *  1. Somados elementos de um array de inteiros
 * 
 */

package Aula_09_For_Each_HashSet.Exercicios;
public class Nivel_Facil_1 {
    
    
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("");
        int[] numeros = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }

        System.out.println("A soma  do array e: " + soma);
        System.out.println("");
        System.out.println("");
    }

}
