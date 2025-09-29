/**
 *
 * @author Marcos Einecke
 *
 * 4. Somadas Diagonais* de uma Matriz: Dada uma matriz 3x3,
 * calcule a soma dos elementos da diagonal principal e da diagonal secundária.
 * somaSecundaria += matriz[i][2-i];
 *
 */
package Aula_11_Matriz.Exercicios;

public class Exercicio_4 {

    public static void main(String[] args) {

        //Variaveis 
        int somaSecundaria = 0;
        int somaPrimaria = 0;
        int soma = 0;

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}

        };

        System.out.println("");
        System.out.println("");

        //Exibir Matriz
        System.out.println("Matriz");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " | ");
            }
            System.out.println();
        }

        System.out.println("");
        System.out.println("VAMOS SOMAR AS DIAGONAIS: ");
        System.out.println("");
        System.out.println("");

   
        //Mostrando o calculo 

        soma = matriz[0][0] + matriz[1][1] + matriz[2][2];
        System.out.println("A soma da primeria diagonal" + soma);
        System.out.println("A soma da segunda  diagonal" + soma);
        
        
        
        System.out.println("");
        System.out.println("");
    }

}
