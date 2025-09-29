/**
 * @author Marcos Einecke
 *
 *
 * */
package Aula_11_Matriz;

import java.util.Scanner;

public class Exemplo_Jogo_Da_Velha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] jogo = new char[3][3];

        
        System.out.println("");
        System.out.println("");
        
        //Inicializa vazio
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                jogo[i][j] = '-';

            }

        }

        //Usuarário digita 3 jogadas 
        for (int k = 0; k < 3; k++) {
            System.out.println("Digite a linha (0-2) : ");
            int linha = sc.nextInt();
            System.out.println("Digite a coluna (0-2) : ");
            int coluna = sc.nextInt();
            System.out.println("Digite X ou O: ");
            char simbolo = sc.next().charAt(0);

            jogo[linha][coluna] = simbolo;

            //Mostrar o tabuleiro
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(jogo[i][j] + "");

                }
                System.out.println("");
            }

        }
    }

}
