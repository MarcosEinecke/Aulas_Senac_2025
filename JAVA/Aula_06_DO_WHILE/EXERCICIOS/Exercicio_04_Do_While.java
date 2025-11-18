/**
 *
 * @author Marcos Einecke
 * 
 * Exercício 4*: Menu de opções com do-while
 *Criar um menu de opções com as seguintes escolhas: 1- Cadastrar, 2- Consultar, 3- Sair.
 *O programa deve repetir a exibição do menu e a leitura da opção até que o usuário escolha a opção 3 (Sair).
 * 
 * 
 */

package Aula_06_DO_WHILE.EXERCICIOS;
public class Exercicio_04_Do_While {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int opcao;
        do {
            System.out.println("Menu de Opções:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção (1-3): ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Opção Cadastrar selecionada.");
                    // Lógica de cadastro aqui
                    break;
                case 2:
                    System.out.println("Opção Consultar selecionada.");
                    // Lógica de consulta aqui
                    break;
                case 3:
                    System.out.println("Saindo do programa. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println(); // Linha em branco para melhor visualização
        } while (opcao != 3);
       
    }
    
}
