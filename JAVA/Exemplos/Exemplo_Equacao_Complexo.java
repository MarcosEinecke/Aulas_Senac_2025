/**
 *
 * @author Marcos Einecke
 *
 *
 */
package Exemplos;

import java.util.Scanner;

public class Exemplo_Equacao_Complexo {

    public static double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    public static double subtrairAoQuadrado(double c, double d) {
        return Math.pow(c - d, 2);
    }

    public static double somar(double soma1, double soma2) {
        return soma1 + soma2;
    }

    public static double dividir(double resultado, double e) {
        if (e != 0) {
            return resultado / e;

        } else {
            throw new ArithmeticException("Divisão por zero não é permitido");
        }
    }

    public static double subtracao(double sub1, double sub2) {
        return sub1 - sub2;

    }

    public static double resolverEquacao(double n1, double n2, double c, double d, double e) {
        double mult = multiplicar(n1, n2);
        double subq = subtrairAoQuadrado(c, d);
        double resultSoma = somar(mult, subq);
       // double subt = subtracao(sub1, sub2);
        return dividir(resultSoma, e);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("Digite o valor de n1: ");
        double n1 = sc.nextDouble();
        
        System.out.println("Digite o valor de n2: ");
        double n2 = sc.nextDouble();
        
        System.out.println("Digite o valor de c: ");
        double c = sc.nextDouble();
        
        System.out.println("Digite o valor de d: ");
        double d = sc.nextDouble();
        
        System.out.println("Digite o valor de e: ");
        double e = sc.nextDouble();
        
        
        try{
            double resultado = resolverEquacao(n1,n2,c,d,e);
            System.out.println("O resultado da equação é: "+resultado);
        }catch (ArithmeticException ex){
            System.out.println("Erro: "+ex.getMessage());
        }
        
        System.out.println("");
        System.out.println("");
    }
}
