/**
 * @author Marcos Einecke
 *
 * Exercício 2: Validação de senha
 *Criar um algoritmo que solicita uma senha ao usuário e verifica se ela é igual à senha correta "1234".
 * O programa deve continuar solicitando a senha até que o usuário digite a senha correta.
 * ## dica: não (!) e equals. ##
 *
 */
package Aula_05.Exercicios;

import java.util.Scanner;

public class Exercicio2_Validação_de_Senha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;
        System.out.println("");
        System.out.println("");

        System.out.println("  VAMOS FAZER O LOGIN");
        System.out.println("");
        System.out.println("");
        System.out.println("Qual é o seu nome de usuario ?");
        String nome = sc.nextLine();
        System.out.println("");
        System.out.println("");
        System.out.println(" Digite a sua senha: ");
        senha = sc.nextLine();
        System.out.println("");
        System.out.println("");

        while (!senha.equals("1234")) {
            System.out.println(" Senha inválida. Tente novamente. ");
            System.out.println("");
            System.out.println("");
            System.out.println(" Digite a sua senha: ");
            senha = sc.nextLine();
            System.out.println("");
            System.out.println("");
        }

        System.out.println(" SEJA BEM VINDO DE VOLTA " + nome);
        System.out.println("");
        System.out.println("");
    }

}
