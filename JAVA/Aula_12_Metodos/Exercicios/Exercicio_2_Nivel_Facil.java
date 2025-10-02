package Aula_12_Metodos.Exercicios;

import java.util.Scanner;

/**
 *
 * @author Marcos Einecke
 * 
 * 2. Crie um método que receba um número inteiro e retorne true se o número for
 par e false se for ímpar. Utilize este método em um programa que verifique a
 paridade de um número fornecido pelo usuário.
 * 
 */
public class Exercicio_2_Nivel_Facil {
    
    
    //Método Inicio
    public static void Inicio(){
        System.out.println("");
        System.out.println("");
        System.out.println("VERIFICADOR DE PAR OU ÍMPAR");
    
        System.out.println("");
        System.out.println("");
        
    }
    
    
    //Método Par ou Ímpar
    
    public static boolean ParOuImpar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Infome 1 número inteiro:");
        int numero = sc.nextInt();
        
                boolean par = (numero % 2) == 0;

        if (par) {
            System.out.println("O numero " + numero + " e PAR.");
        } else {
            System.out.println("O numero " + numero + " e IMPAR.");
        }
        
       return par;
    }
    
    
    public static void main(String[] args) {
        
        Inicio();
        
        System.out.println("");
        System.out.println("");
        
       boolean verificador = ParOuImpar();
        
        System.out.println("");
        System.out.println("");
        

        
        
    }
    
    
    
    
    
}
