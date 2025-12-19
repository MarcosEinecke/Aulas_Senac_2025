/**
 *
 * @author Marcos Einecke
 */


package Aula_004_Herança.Exercicios_04_Eletrodomesticos;
public class Eletrodomestico {
    
    protected String marca, modelo;
    protected boolean ligado;

    public Eletrodomestico(String marca, String modelo, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = ligado;
    }
}
