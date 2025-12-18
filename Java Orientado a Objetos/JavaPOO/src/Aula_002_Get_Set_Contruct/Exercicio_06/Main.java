/**
 *
 * @author Marcos Einecke
 *
 *  6. Classe Retângulo: Crie uma classe Retangulo com os atributos largura e
 * altura. Crie um construtor, métodos getters e setters, e os métodos
 * calcularArea() e calcularPerimetro() que retornam a área e o perímetro do
 * retângulo, respectivamente.
 *
 */
package Aula_002_Get_Set_Contruct.Exercicio_06;

public class Main {

    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo(96.20, 100.50);

        System.out.println(retangulo1.calcularArea());
        System.out.println(retangulo1.calcularPerimetro());

    }

}
