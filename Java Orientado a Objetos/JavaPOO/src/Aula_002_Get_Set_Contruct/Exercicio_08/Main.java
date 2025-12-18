/**
 *
 * @author Marcos Einecke
 *
 * 8. Classe Aluno: Crie uma classe Aluno com os atributos nome, matricula e
 * notas (um array de doubles). Crie um construtor, métodos getters e setters, e
 * um método calcularMedia() que retorna a média das notas do aluno.
 *
 *
 *
 */
package Aula_002_Get_Set_Contruct.Exercicio_08;

import java.util.Scanner;

public class Main {

    
    
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nomeA1 = teclado.nextLine();

        System.out.println("Digite a matricula do aluno: ");
        int matriculaA1 = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Digite a quantidade de notas:");
        int quantidadeNotas = teclado.nextInt();
        double[] notasA1 = new double[quantidadeNotas];

        for (int i = 0; i < quantidadeNotas; i++) {

            System.out.println("Digite a nota " + (i + 1) + ":");
            notasA1[i] = teclado.nextDouble();

        }

        Aluno a1 = new Aluno(nomeA1, matriculaA1, notasA1);
        a1.setNome(nomeA1);
        a1.setMatricula(matriculaA1);
        a1.setNotas(notasA1);

        //double notasdoaluno1[] = {7.5,8,9,5.7};
        //Aluno a1 = new Aluno("Paulo",12345,notasdoaluno1);
        double media = a1.calcularMedia();
        System.out.println("Média do aluno " + a1.getNome() + " : " + media);

    }

}
