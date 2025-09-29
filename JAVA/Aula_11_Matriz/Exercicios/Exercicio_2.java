/**
 *
 * @author Marcos Einecke
 * 
 * 2. Matriz Identidade: Verifique se uma matriz 3x3 é uma matriz identidade 
 * (uma matriz onde os elementos da diagonal principal são 1 e todos os outros são 0).
 * 
 */


package Aula_11_Matriz.Exercicios;
public class Exercicio_2 {
    public static void main(String[] args) {
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
       
        int [][] matriz = {
            {1,0,1},
            {0,0,0},
            {1,0,1},
            
            
        };
        
        //Exibir Matriz
        System.out.println("Matriz");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " | ");
            }
            System.out.println();
        }
        
        
        
        
        
        System.out.println("");
        System.out.println("");
        
    }
    
}
