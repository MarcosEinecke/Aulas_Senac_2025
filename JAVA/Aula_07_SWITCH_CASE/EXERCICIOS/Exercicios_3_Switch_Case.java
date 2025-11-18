
/**
 *
 * @author Marcos Einecke
 * 
 * Exercício 3: Sistema de Suporte Técnico
 *Monte um programa que apresente ao usuário um menu com os seguintes problemas comuns:
 *1 - Problema de internet
 *2 - Problema de login
 *3 - Erro no sistema
 *4 - Solicitação de atualização
 *Cada opção deve exibir uma mensagem de orientação ao usuário, como se fosse um chatbot de suporte.
 *Se a opção for inválida, exiba “Opção não reconhecida, tente novamente.”
 *  
 * 
 */


package Aula_07_SWITCH_CASE.EXERCICIOS;

public class Exercicios_3_Switch_Case {
    public static void main(String[] args) {
        int problema = 2; 

        switch (problema) {
            case 1:
                System.out.println("Verifique sua conexão com o roteador e reinicie-o.");
                break;
            case 2:
                System.out.println("Tente redefinir sua senha ou verifique se o CAPS LOCK está ativado.");
                break;
            case 3:
                System.out.println("Reinicie o sistema e verifique se há atualizações disponíveis.");
                break;
            case 4:
                System.out.println("Acesse as configurações do sistema para verificar atualizações.");
                break;
            default:
                System.out.println("Opção não reconhecida, tente novamente.");
                break;
        }
    }

    
}
