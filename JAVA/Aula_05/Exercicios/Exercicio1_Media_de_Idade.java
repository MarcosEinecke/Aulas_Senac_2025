/**
* @author Marcos Einecke 
*
*Exercício 1: Cálculo da média de idade de uma turma
Desenvolver um algoritmo que calcula a média de idade dos alunos de uma turma. 
O usuário deve informar a idade de cada aluno e digitar um valor negativo para indicar o fim da entrada de dados.
 ## dica: pode ser usado While e if-else ##
*/

package Aula_05.Exercicios;

import java.util.Scanner;

public class Exercicio1_Media_de_Idade {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int idade, somaIdade = 0, contador = 0;
    double mediaIdade;
    System.out.println();
    System.out.println();

    System.out.println(" CALCULO DA MEDIA DE IDADE DE UMA TURMA ");
    System.out.println();
    System.out.println();

    while (true) {
      System.out.println("Digite o nome do aluno (ou apenas ENTER para sair): ");
      String nome = sc.nextLine();
      System.out.println("Digite a idade do aluno (negativo para encerrar): ");
      String idadeStr = sc.nextLine();
      System.out.println();
      System.out.println();
      try {
        idade = Integer.parseInt(idadeStr);
      } catch (NumberFormatException e) {
        System.out.println("Idade invalida. Tente novamente.");
        System.out.println();
        System.out.println();
        continue;
      }
      if (idade < 0) {
        break;
      }
      somaIdade += idade;
      contador++;
    }
    if (contador > 0) {
      mediaIdade = (double) somaIdade / contador;
      System.out.printf("A media de idade da turma e: %.2f anos%n", mediaIdade);
      System.out.println();
      System.out.println();
    } else {
      System.out.println("Nenhuma idade valida foi inserida.");
      System.out.println();
      System.out.println();
    }

    System.out.println();
    System.out.println();
  }

}
