/**
 *
 * @author Marcos Einecke
 */
package Aula_001_Introdução.Exercicio_05;

public class Circulo {
    
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
            
    
 

    double calcularArea() {

        return Math.PI * raio * raio;

    }

    double calcularCircunferencia() {

        return 2 * Math.PI * raio;

    }

}
