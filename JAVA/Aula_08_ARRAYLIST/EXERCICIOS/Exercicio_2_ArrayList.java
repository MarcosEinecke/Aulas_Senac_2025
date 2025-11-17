
/**
 *
 * @Marcos_Einecke
 * 
 * 2. Acessar Elementos por Índice:
 *Crie um ArrayList de doubles, adicione cinco números decimais, acesse e imprima o terceiro elemento da lista.
 * 
 */

package Aula_08_ARRAYLIST.EXERCICIOS;

public class Exercicio_2_ArrayList {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();

        System.out.println("VAMOS CRIAR UM ARRAYLIST DE NÚMEROS DECIMAIS");
        System.out.println();

        // Criando o ArrayList de doubles
        java.util.ArrayList<Double> lista_numeros = new java.util.ArrayList<>();

        lista_numeros.add(10.5);
        lista_numeros.add(23.7);
        lista_numeros.add(5.9);
        lista_numeros.add(42.3);
        lista_numeros.add(18.6);

        // Acessando o terceiro elemento (índice 2)

        Double terceiro_numero = lista_numeros.get(2);

        System.out.println("O terceiro número na lista é: " + terceiro_numero);
        System.out.println();
        System.out.println();

    }

}

