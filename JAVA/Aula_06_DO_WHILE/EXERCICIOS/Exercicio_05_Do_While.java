/**
 *
 * @author Marcos Einecke
 * 
 * Exercício 5: Jogo de adivinhação com do-while
 *Criar um jogo de adivinhação onde o programa gera um número aleatório entre 1 e 100, e o usuário tenta adivinhar. 
 *O programa deve fornecer dicas (maior ou menor) e contar as tentativas. O jogo termina quando o usuário acerta o número.
 * 
 */

package Aula_06_DO_WHILE.EXERCICIOS;
public class Exercicio_05_Do_While {
    public static void main(String[] args) {
        System.out.println("JOGO DE ADIVINHAÇÃO");
        System.out.println("=====================");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int numeroAleatorio = new java.util.Random().nextInt(100) + 1;
        int tentativas = 0;
        int palpite;
        do {
            System.out.print("Digite seu palpite (1-100): ");
            palpite = scanner.nextInt();
            tentativas++;
            if (palpite < numeroAleatorio) {
                System.out.println("Tente um número maior.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + " em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroAleatorio);
     
    }
    
}
