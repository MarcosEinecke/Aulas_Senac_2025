
/**
 *
 * @author Marcos Einecke
 * 
 * Exercício 3: Tabuada de um número
 *Criar um algoritmo que exibe a tabuada de um número inteiro positivo informado pelo usuário. 
 * O programa deve validar se o número digitado é positivo antes de exibir a tabuada. 
 * 
 */


package Aula_05.Exercicios;
public class Exercicio3_Tabuada_de_um_numero {
    public static void main(String[] args) {
        int numero = 5; 

        // Verificando se o número é positivo
        if (numero > 0) {
            System.out.println("Tabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("Por favor, insira um número inteiro positivo.");
        }
    }
    
}
