/**
 *
 * @author Marcos Einecke
 * 
 * Exercício 3*: Contagem regressiva com pausa
 *Criar um algoritmo que faça uma contagem regressiva de 10 a 1, com um intervalo de 1 segundo entre cada número.
 * Usando só DO WHILE.
 * 
 */

package Aula_06_DO_WHILE.EXERCICIOS;
public class Exercicio_03_Do_While {
    public static void main(String[] args) {
        System.out.println("CONTAGEM REGRESSIVA");
        System.out.println("=====================");
        int contador = 10;
        do {
            System.out.println(contador);
            contador--;
            try {
                Thread.sleep(1000); // Pausa de 1 segundo (1000 milissegundos)
            } catch (InterruptedException e) {
                System.out.println("A contagem foi interrompida.");
            }
        } while (contador >= 1);
        System.out.println("FIM!");


        //USEI IA PARA FAZER ESTE CÓDIGO
    }

    
}
