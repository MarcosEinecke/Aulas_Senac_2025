/**
 *
 * @Marcos_Einecke
 *
 * 8. Crie uma classe Aluno com os atributos nome (String), matricula (int) e notas (um
 *array de doubles). Crie um método calcularMedia() que retorna a média das notas
 *do aluno.
 *
 */
package Aula_001_Introdução.Exercicio_08;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        //aluno1.nome = "Perigo";
        //aluno1.matricula = 12345;
        //aluno1.notas = new double[]{7.5, 8.0, 6.0, 9.5};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        aluno1.nome = sc.nextLine();
        
        System.out.println("Digite a matricula do aluno: ");
        aluno1.matricula = sc.nextInt();
        
        System.out.println("Digite e quantidade de notas: ");
        int quantidadeNotas = sc.nextInt();
        aluno1.notas = new double [quantidadeNotas];
        
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.println("Digite a nota "+(i+1)+ " : ");
            aluno1.notas[i] = sc.nextDouble();
            
        }

        double media = aluno1.calcularMedia();
        System.out.println("Média do aluno " + aluno1.nome + " : " + media);

    }

}
