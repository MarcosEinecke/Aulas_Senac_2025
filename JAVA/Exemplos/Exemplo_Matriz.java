/**
 *
 * @author Marcos Einecke
 *
 *
 */
package Exemplos;

public class Exemplo_Matriz {

    public static void main(String[] args) {

        int[][] tabuada = new int[11][11];

        for (int linha = 1; linha < 11; linha++) {
            for (int coluna = 1; coluna < 11; coluna++) {
                tabuada[linha][coluna] = (linha) * (coluna);

            }
        }
        //Imprime a tabuada formatada
        for (int linha = 1; linha < 11; linha++) {
            for (int coluna = 1; coluna < 11; coluna++) {

                System.out.println(linha+ " x " +coluna+ " = " +tabuada[linha][coluna]+"\t");
                

            }
        }
    }
}