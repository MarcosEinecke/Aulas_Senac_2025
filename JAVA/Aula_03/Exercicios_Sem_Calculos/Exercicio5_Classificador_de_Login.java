package Aula_03.Exercicios_Sem_Calculos;

import java.util.Scanner;

public class Exercicio5_Classificador_de_Login {

    /*
     * @aturor Marcos Einecke
     * 5. Classificador de Login: Faça um programa que leia um login e informe se
     * ele é "válido" (contém pelo menos 6 caracteres e não tem espaços) ou
     * "inválido". DICA: "if (login.length() >= 6 && !login.contains(" ")) {"
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String login = "MarcosEincke";
        System.out.println();
        System.out.println();
        System.out.println("              CLASSIFICADOR DE LOGIN                                         ");
        System.out.println("");
        System.out.println();
        System.out.print("Digite o login: ");
        login = teclado.nextLine();

        if (login.length() >= 6 && !login.contains(" ")) {
            System.out.println("Login válido");
        } else {
            System.out.println("Login inválido");
        }

        System.out.println();
        System.out.println();

    }

}
