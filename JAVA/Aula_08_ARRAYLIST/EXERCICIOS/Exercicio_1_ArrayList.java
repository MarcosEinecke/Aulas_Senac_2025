
/**
 *
 * @Marcos_Einecke
 * 
 * 
 * 1. Adicionar e Imprimir Elementos:
 * Crie um ArrayList de strings, adicione cinco nomes de cidades, imprima todas as cidades na lista. 
 * 
 * 
 * 
 */

package Aula_08_ARRAYLIST.EXERCICIOS;

public class Exercicio_1_ArrayList {

    public static void main(String[] args) {
        System.out.println();
        System.out.println();

        System.out.println("VAMOS CRIAR UM ARRAYLIST DE CIDADES");
        System.out.println();

        // Criando o ArrayList de strings
        java.util.ArrayList<String> lista_cidades = new java.util.ArrayList<>();

        lista_cidades.add("São Paulo");
        lista_cidades.add("Rio de Janeiro");
        lista_cidades.add("Belo Horizonte");
        lista_cidades.add("Curitiba");
        lista_cidades.add("Porto Alegre");

        System.out.println("Cidades na lista:");

        // Cidadades na lista
        for (String cidade : lista_cidades) {
            System.out.println(cidade);
        }

        System.out.println();
        System.out.println();

    }

}
