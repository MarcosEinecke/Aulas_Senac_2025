/**
 *
 * @Marcos_Einecke
 * 
 * 
 * Exercício 4: Menu de Controle de Dispositivos Inteligentes
 *Crie um programa que exiba um menu para controlar dispositivos de uma casa inteligente:
 *1 - Acender luzes
 *2 - Apagar luzes
 *3 - Ligar TV
 *4 - Desligar TV
 *5 - Abrir portão
 *6 - Fechar portão
 *Cada opção deve exibir a ação correspondente. Se for digitado um número inválido, exiba “Comando inválido.”
 * 
 */

package Aula_07_SWITCH_CASE.EXERCICIOS;

public class Exercicios_4_Switch_Case {
    public static void main(String[] args) {
        int comando = 3; 

        switch (comando) {
            case 1:
                System.out.println("Acendendo luzes...");
                break;
            case 2:
                System.out.println("Apagando luzes...");
                break;
            case 3:
                System.out.println("Ligando TV...");
                break;
            case 4:
                System.out.println("Desligando TV...");
                break;
            case 5:
                System.out.println("Abrindo portão...");
                break;
            case 6:
                System.out.println("Fechando portão...");
                break;
            default:
                System.out.println("Comando inválido.");
                break;
        }
    }
    
}
