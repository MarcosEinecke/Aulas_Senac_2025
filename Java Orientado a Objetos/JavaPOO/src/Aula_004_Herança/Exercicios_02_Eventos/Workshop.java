/**
 *
 * @author Marcos Einecke
 */

package Aula_004_Herança.Exercicios_02_Eventos;
public class Workshop extends Evento{
 
    private String instrutor;

    public Workshop(String nome, String data, String instrutor) {
        super(nome, data);
        this.instrutor = instrutor;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }
    
}
