
/**
 *
 * @Marcos_Einecke
 * 
 * Exercício 2: Simulador de Assistente Virtual
 *Crie um programa que apresente ao usuário um menu de opções:
 *1 - Ver previsão do tempo
 *2 - Ver notícias
 *3 - Abrir agenda
 *4 - Ouvir música
 *Cada opção deve exibir uma mensagem simulando a resposta de um assistente virtual.
 *Use switch-case para controlar o fluxo.
 * 
 * 
 */

package Aula_07_SWITCH_CASE.EXERCICIOS;
public class Exercicios_2_Switch_Case {
    public static void main(String[] args) {
        int opcao = 3; // Exemplo de opção selecionada

        switch (opcao) {
            case 1:
                System.out.println("Assistente Virtual: A previsão do tempo para hoje é ensolarado com máxima de 25°C.");
                break;
            case 2:
                System.out.println("Assistente Virtual: Aqui estão as últimas notícias: [notícias fictícias].");
                break;
            case 3:
                System.out.println("Assistente Virtual: Abrindo sua agenda para hoje. Você tem 3 compromissos.");
                break;
            case 4:
                System.out.println("Assistente Virtual: Tocando sua playlist favorita.");
                break;
            default:
                System.out.println("Erro: Opção inválida.");
                break;
        }
    }
    
    
}
