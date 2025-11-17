

/**
 *
 * @Marcos_Einecke
 * 
 * 5. Reverter a Lista:
 *Crie um ArrayList de strings, adicione seis palavras, inverta a ordem dos elementos na lista sem usar bibliotecas auxiliares e imprima a lista revertida.
 * 
 * 
 */


package Aula_08_ARRAYLIST.EXERCICIOS;

public class Exercicio_5_ArrayList {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();

        System.out.println("VAMOS CRIAR UM ARRAYLIST DE PALAVRAS");
        System.out.println();

        // Criando o ArrayList de strings
        java.util.ArrayList<String> lista_palavras = new java.util.ArrayList<>();

        lista_palavras.add("Java");
        lista_palavras.add("Python");
        lista_palavras.add("C++");
        lista_palavras.add("JavaScript");
        lista_palavras.add("Php");
        lista_palavras.add("HTML");

        // Invertendo a ordem dos elementos na lista
        int tamanho = lista_palavras.size();
        for (int i = 0; i < tamanho / 2; i++) {
            String temp = lista_palavras.get(i);
            lista_palavras.set(i, lista_palavras.get(tamanho - 1 - i));
            lista_palavras.set(tamanho - 1 - i, temp);
        }

        System.out.println("Lista de palavras revertida:");
        for (String palavra : lista_palavras) {
            System.out.println(palavra);
        }

        System.out.println();
        System.out.println();
    }
    
}
