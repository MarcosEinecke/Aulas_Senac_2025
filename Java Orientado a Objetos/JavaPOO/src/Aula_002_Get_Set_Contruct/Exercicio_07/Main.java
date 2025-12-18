/**
 *
 * @author Marcos Einecke
 *
 * 7. Classe Círculo: Crie uma classe Circulo com o atributo raio. Crie um
 * construtor, métodos getters e setters, e os métodos calcularArea() e
 * calcularCircunferencia() que retornam a área e a circunferência do círculo,
 * respectivamente. Utilize a constante Math.PI.
 *
 *
 *
 */
package Aula_002_Get_Set_Contruct.Exercicio_07;

public class Main {

    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(360);

        System.out.println(circulo1.calcularArea());
        System.out.println(circulo1.calcularCircunferencia());

    }

}
