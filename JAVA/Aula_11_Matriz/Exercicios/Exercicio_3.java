/**
 *
 * @author Marcos Einecke
 *
 * 3. Matriz Transposta*: Dada uma matriz 3x3, crie e exiba a sua matriz transposta (trocar linhas por colunas).
 *Criar uma nova matriz 3x3 pra armazenar a transporta
 *
 */
package Aula_11_Matriz.Exercicios;

public class Exercicio_3 {

    public static void main(String[] args) {


        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}

        };



    for (int i = 0; i < 3; i++) {
        System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz [j][i]+" | ");
            }
        }       




        System.out.println("");
        System.out.println("");

    }

}
