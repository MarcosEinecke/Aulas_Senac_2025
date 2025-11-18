/**
 *
 * @author Marcos Einecke
 * 
 * Exercício 5: Sistema de Navegação em Aplicativo
 *Implemente um programa que simule a navegação entre páginas de um aplicativo:
 *1 - Página inicial
 *2 - Perfil
 *3 - Configurações
 *4 - Notificações
 *5 - Sair
 *Cada opção deve mostrar a mensagem “Você está na página: …”. Se o usuário escolher “Sair”, mostre “Aplicativo encerrado.” e finalize o programa.
 * 
 * 
 */



package Aula_07_SWITCH_CASE.EXERCICIOS;
public class Exercicios_5_Switch_Case {
    public static void main(String[] args) {
        int pagina = 3; 

        switch (pagina) {
            case 1:
                System.out.println("Você está na página: Página inicial");
                break;
            case 2:
                System.out.println("Você está na página: Perfil");
                break;
            case 3:
                System.out.println("Você está na página: Configurações");
                break;
            case 4:
                System.out.println("Você está na página: Notificações");
                break;
            case 5:
                System.out.println("Aplicativo encerrado.");
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma página entre 1 e 5.");
                break;
        }
    }
    
    
}
