/**
 *
 * @author Marcos Einecke
 *
 * 3. Classe Carro: Crie uma classe Carro com os atributos marca, modelo, ano
 * e ligado (booleano). Crie um construtor, métodos getters e setters, e os
 * métodos ligar() e desligar() que alteram o estado do atributo ligado.
 *
 *
 */
package Aula_002_Get_Set_Contruct.Exercicio_03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro c1 = new Carro("Chevrolet", "Agile", 2013, true);

        boolean desligado;
        boolean ligado;

        System.out.println("\n VAMOS TESTAR SEU CARRO NOVO! ");
        System.out.println("\n" + c1.getMarca());
        System.out.println(c1.getModelo());
        System.out.println(c1.getAno());
        System.out.println("\n   Precione qualquer tecla para continuar  ");
        String chave = sc.nextLine();

        System.out.println("\nSEU CARRO ESTÁ BATENDO CHAVE....");
        System.out.println("SEU CARRO ESTÁ BATENDO CHAVE....");
        
        c1.desligar();
        System.out.println("   Precione qualquer tecla para continuar  ");
        chave = sc.nextLine();
        
        System.out.println("\n VAMOS TENTAR DE NOVO ");
        System.out.println("   Precione qualquer tecla para continuar  ");
        chave = sc.nextLine();
        
        c1.ligar();
        
        System.out.println("");
        System.out.println("");
    }

}
