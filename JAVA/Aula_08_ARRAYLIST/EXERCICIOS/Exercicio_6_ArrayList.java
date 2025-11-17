/**
 *
 * @Marcos-Einecke
 * 
 *6. Substituir Elementos:
 *Crie um ArrayList de strings, adicione cinco nomes de frutas e substitua o terceiro nome por "Morango". 
 * Imprima a lista resultante.
 * 
 * 
 */



package Aula_08_ARRAYLIST.EXERCICIOS;
public class Exercicio_6_ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> frutas = new java.util.ArrayList<>();

        // Adicionando cinco nomes de frutas
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Uva");
        frutas.add("Abacaxi");

        // Substituindo o terceiro nome por "Morango"
        frutas.set(2, "Morango");

        // Imprimindo a lista resultante
        System.out.println("Lista de frutas após substituição: " + frutas);
    }
    
}
