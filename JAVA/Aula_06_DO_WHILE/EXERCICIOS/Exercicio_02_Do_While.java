/**
 *
 * @author Marcos Einecke
 * 
 * Exercício 2: Média de notas com validação
 * Criar um algoritmo que leia 4 notas de um aluno, validando se as notas estão entre 0 e 10. Calcular e exibir a média das notas.
 * 
 */

package Aula_06_DO_WHILE.EXERCICIOS;
public class Exercicio_02_Do_While {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double somaNotas = 0;
        int quantidadeNotas = 4;
        int contador = 0;

        do {
            System.out.print("Digite a nota " + (contador + 1) + " (entre 0 e 10): ");
            double nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Por favor, digite uma nota entre 0 e 10.");
            } else {
                somaNotas += nota;
                contador++;
            }
        } while (contador < quantidadeNotas);

        double media = somaNotas / quantidadeNotas;
        System.out.printf("A média das notas é: %.2f%n", media);
    }
    
}
