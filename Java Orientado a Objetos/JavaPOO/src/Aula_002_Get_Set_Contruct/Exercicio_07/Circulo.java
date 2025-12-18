/**
 *
 * @author Marcos Einecke
 *
 */
package Aula_002_Get_Set_Contruct.Exercicio_07;

public class Circulo {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    double calcularArea() {

        return Math.PI * raio * raio;

    }

    double calcularCircunferencia() {

        return 2 * Math.PI * raio;

    }

}
