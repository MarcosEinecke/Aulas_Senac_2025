/**
 *
 * @author Marcos Einecke
 */


package Aula_004_Herança.Exercicios_04_Eletrodomesticos;
public class Microondas extends Eletrodomestico{
    
    private String potencia;

    public Microondas(String marca, String modelo, boolean ligado, String potencia) {
        super(marca, modelo, ligado);
        this.potencia = potencia;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
    
}
