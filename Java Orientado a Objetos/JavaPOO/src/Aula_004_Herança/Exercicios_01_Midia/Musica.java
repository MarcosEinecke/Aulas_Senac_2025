/**
 *
 * @author Marcos   Einecke
 */

package Aula_004_Herança.Exercicios_01_Midia;
public class Musica extends Midia {
    
    
    private String artista,album;
    
    
    public Musica(String titulo, String duracao,String artista,String album) {
        super(titulo, duracao);
        
        this.artista = artista;
        this.album = album;
                                              
      }

    
    
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
    
    
    
    
    
}
