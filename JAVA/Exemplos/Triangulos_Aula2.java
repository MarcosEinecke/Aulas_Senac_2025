package Exemplos;

import java.util.Scanner;

/**
 *
 * @author MarcosEinecke
 */
public class Triangulos_Aula2 {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro lado: ");
        double L1 = sc.nextDouble();
        System.out.println("Digite o segundo lado: ");
        double L2 = sc.nextDouble();
        System.out.println("Digite o terceiro lado: ");
        double L3 = sc.nextDouble();

        boolean tri = (L1 < L2 + L3) && (L2 < L1 + L3) && (L3 < L1 + L2);
        boolean eq = (L1 == L2) && (L2 == L3);
        boolean esca = (L1 != L2) && (L2 != L3) && (L3 != L1);
        boolean iso = (L1 == L2 && L1 != L3) || (L1 == L3 && L1 != L2) || (L2 == L3 && L2 != L1);

        System.out.println("Pode formar um  TRIÂNGULO? " + tri);
        System.out.println("Pode formar um  TRIÂNGULO EQUILÁTERO? " + eq);
        System.out.println("Pode formar um  TRIÂNGULO ESCALENO? " + esca);
        System.out.println("Pode formar um TRIÂNGULO ISÓSCELES " + iso);
        sc.close();
    }

}
