
/**
 *
 * @Marcos_Einecke
 * 
 * 8. Iterar com Índice:
 *Crie um ArrayList de strings, adicione cinco nomes de países, use um loop for com índice para imprimir cada país na lista.
 * 
 */



package Aula_08_ARRAYLIST.EXERCICIOS;

public class Exercicio_8_ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> paises = new java.util.ArrayList<>();

        // Adicionando cinco nomes de países
        paises.add("Brasil");
        paises.add("Argentina");
        paises.add("Chile");
        paises.add("Colômbia");
        paises.add("Peru");

        // Usando um loop for com índice para imprimir cada país na lista
        for (int i = 0; i < paises.size(); i++) {
            System.out.println("País " + (i + 1) + ": " + paises.get(i));
        }
    }
    
}
