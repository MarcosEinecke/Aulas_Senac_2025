/**
 *
 * @Marcos_Einecke
 * 
 * 7. Ordenar Elementos:
 *Crie um ArrayList de inteiros, adicione dez números aleatórios, ordene a lista em ordem crescente e imprima.
 * 
 */

package Aula_08_ARRAYLIST.EXERCICIOS;

public class Exercicio_7_ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> numeros = new java.util.ArrayList<>();
        java.util.Random random = new java.util.Random();

        // Adicionando dez números aleatórios
        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(100)); // Números entre 0 e 99
        }

        // Ordenando a lista em ordem crescente
        java.util.Collections.sort(numeros);

        // Imprimindo a lista ordenada
        System.out.println("Lista de números ordenados: " + numeros);
    }
    
    
}
