/**
 *
 * @author Marcos Einecke
 * 
 * 
 *Exercício 5: Jogo de par ou ímpar
 *Criar um jogo de par ou ímpar contra o computador. O usuário escolhe entre par ou ímpar e digita um número de 0 a 5.
 * O computador gera um número aleatório de 0 a 5, e o programa verifica quem ganhou a rodada. 
 * O jogo continua até que o usuário digite "sair" para encerrar. Usando While e Ifs.
 * 
 */

package Aula_05.Exercicios;
public class Exercicio5_Jogo_de_par_ou_impar {
    public static void main(String[] args) {
        System.out.println("JOGO DE PAR OU ÍMPAR");
        System.out.println("=====================");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String escolhaUsuario;
        do {
            System.out.print("Escolha par ou ímpar (ou digite 'sair' para encerrar): ");
            escolhaUsuario = scanner.nextLine().trim().toLowerCase();
            if (escolhaUsuario.equals("sair")) {
                System.out.println("Encerrando o jogo. Obrigado por jogar!");
                break;
            }
            // Normaliza acento: aceita "impar" sem acento ou "ímpar"
            if (escolhaUsuario.equals("ímpar")) {
                escolhaUsuario = "impar";
            }
            if (!escolhaUsuario.equals("par") && !escolhaUsuario.equals("impar")) {
                System.out.println("Escolha inválida. Tente novamente.");
                continue;
            }
            System.out.print("Digite um número de 0 a 5: ");
            String numeroStr = scanner.nextLine().trim();
            int numeroUsuario;
            try {
                numeroUsuario = Integer.parseInt(numeroStr);
            } catch (NumberFormatException e) {
                System.out.println("Número inválido. Tente novamente.");
                continue;
            }
            if (numeroUsuario < 0 || numeroUsuario > 5) {
                System.out.println("Número inválido. Tente novamente.");
                continue;
            }
            int numeroComputador = new java.util.Random().nextInt(6);
            System.out.println("Número do computador: " + numeroComputador);
            int soma = numeroUsuario + numeroComputador;
            String resultado = (soma % 2 == 0) ? "par" : "impar";
            String resultadoPrint = resultado.equals("impar") ? "ímpar" : "par";
            System.out.println("Soma: " + soma + " (" + resultadoPrint + ")");
            if (resultado.equals(escolhaUsuario)) {
                System.out.println("Você ganhou esta rodada!");
            } else {
                System.out.println("O computador ganhou esta rodada!");
            }
        } while (true);

        scanner.close();

    }

    
    
}
