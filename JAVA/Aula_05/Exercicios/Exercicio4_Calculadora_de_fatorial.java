/**
 *
 * @author Marcos Einecke
 * 
 * Exercício 4:  Calculadora de fatorial
 *Criar um algoritmo que calcula o fatorial de um número inteiro não negativo informado pelo usuário. 
 * O programa deve validar se o número digitado é não negativo. ## dica: fatorial *= contador; ##
 * 
 * 
 */

package Aula_05.Exercicios;
public class Exercicio4_Calculadora_de_fatorial {
    public static void main(String[] args) {
        int numero = 5; 
        long fatorial = 1; 

        // Verificando se o número é não negativo
        
        if (numero < 0) {
            System.out.println("Número inválido! Por favor, insira um número inteiro não negativo.");
        } else {
            // Calcula o fatorial
            for (int contador = 1; contador <= numero; contador++) {
                fatorial *= contador; // Multiplica o fatorial pelo contador
            }
            // Exibe o resultado
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }
    
}
