

/**
*
* @Marcos_Einecke
* 
* Exercício 1: Sistema de Login por Perfil de Usuário
*Crie um programa que peça ao usuário o tipo de perfil de login:
*1 → Administrador
*2 → Editor
*3 → Visitante
*Use switch-case para exibir as permissões de cada perfil:
*Administrador: pode criar, editar e excluir.
*Editor: pode criar e editar.
*Visitante: apenas visualizar.
*
*Se for digitada uma opção inválida, mostre mensagem de erro.
 * 
 * 
 */

package Aula_07_SWITCH_CASE.EXERCICIOS;
public class Execicios_1_Switch_Case {
    public static void main(String[] args) {
        int perfilLogin = 2; // Exemplo de perfil de login

        switch (perfilLogin) {
            case 1:
                System.out.println("Administrador: pode criar, editar e excluir.");
                break;
            case 2:
                System.out.println("Editor: pode criar e editar.");
                break;
            case 3:
                System.out.println("Visitante: apenas visualizar.");
                break;
            default:
                System.out.println("Erro: Opção inválida.");
                break;
        }
    }
    
}
