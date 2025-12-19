/**
 *
 * @author Marcos Einecke
 */

package Aula_004_Herança.Exercicios_02_Eventos;
public class Palestra extends Evento{
    
    private String palestrante;

    public Palestra(String nome, String data, String palestrante) {
        super(nome, data);
        this.palestrante = palestrante;
    }

    public String getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(String palestrante) {
        this.palestrante = palestrante;
    }
    
}
