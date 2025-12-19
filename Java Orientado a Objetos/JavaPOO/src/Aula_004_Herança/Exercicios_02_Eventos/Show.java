/**
 *
 * @author Marcos Einecke
 */


package Aula_004_Herança.Exercicios_02_Eventos;
public class Show extends Evento{
    
    private String artista;

    public Show(String nome, String data, String artista) {
        super(nome, data);
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    
}
