/**
 *
 * @author Marcos Einecke
 *
 * Em vez de colocar toda a lógica de um jogo em um único
 * método main,você pode dividir as partes principais em métodos
 * separdos, como iniciarJogo,procesarEntrada, e verificarVencedor
 *
 */
package Exemplos;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhação_Aula_12_Metodos {
    
    public static void iniciarJogo(){
        System.out.println("BEM VINDO AO JOGO DE ADVINHAÇÃO!");
        System.out.println("Tente adivinhar o número que estou pensando,entre 1 e 100.");           
                       
    }
                 
        
    //Método para processar a entrada do usuário
    public static int processarEntrada(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu palpite: ");
            return sc.nextInt();
    }
            
            
      //Método para verificar se o jogador venceu 
    
    public static boolean verificarVencedor(int palpite, int numeroSecreto){
        if (palpite == numeroSecreto) {
            System.out.println("");
            System.out.println("");
            System.out.println("Parabéns! Você acertou o número!");
            return true;
            
        }else if (palpite < numeroSecreto) {
            System.out.println("O número é maior que "+palpite);
            
        }else{
            System.out.println("O número é menor que "+palpite);
        }
        return false;
        
    }   
            
            
    public static void main(String[] args) {
        iniciarJogo();//chamdo o método
        
        
        Random rd = new Random();
        int numeroSecreto = rd.nextInt(101); 
        boolean venceu = false;
        
        while(!venceu ){
            int palpite = processarEntrada();
            venceu = verificarVencedor(palpite,numeroSecreto);
            
        }

        System.out.println("Obrigado por jogar!");
    }

}
