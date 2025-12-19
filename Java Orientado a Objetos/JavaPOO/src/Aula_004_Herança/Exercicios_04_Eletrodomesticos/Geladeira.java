/**
 *
 * @author Marcos Einecke
 */

package Aula_004_Herança.Exercicios_04_Eletrodomesticos;
public class Geladeira extends Eletrodomestico{
    
    private double temperatura;

    public Geladeira(String marca, String modelo, boolean ligado, double temperatura) {
        super(marca, modelo, ligado);
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    
}