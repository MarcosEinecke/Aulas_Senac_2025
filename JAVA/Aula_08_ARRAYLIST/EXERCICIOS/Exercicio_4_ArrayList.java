/**
 *
 * @Marcos_Einecke
 * 
 * 4. Tamanho da Lista:
 *Crie um ArrayList de caracteres, adicione quatro letras e imprima o tamanho da lista.
 * 
 * 
 */


package Aula_08_ARRAYLIST.EXERCICIOS;

public class Exercicio_4_ArrayList {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();

        System.out.println("VAMOS CRIAR UM ARRAYLIST DE CARACTERES");
        System.out.println();

        // Criando o ArrayList de caracteres
        java.util.ArrayList<Character> lista_caracteres = new java.util.ArrayList<>();

        lista_caracteres.add('A');
        lista_caracteres.add('B');
        lista_caracteres.add('C');
        lista_caracteres.add('D');

        // Obtendo o tamanho da lista
        int tamanho_lista = lista_caracteres.size();

        System.out.println("O tamanho da lista de caracteres é: " + tamanho_lista);
        System.out.println();
        System.out.println();

    }
    
}
