/**
 *
 * @author Marcos Einecke
 */

package Aula_004_Herança.Exemplos_2;
public class Administrador extends Usuario{
    
    private int nivelDeAcesso;
    
    
    public Administrador(String nome, String login,int nivelDeAcesso) {
        super(nome, login);
        this.nivelDeAcesso = nivelDeAcesso;
        
        
    }

    public int getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(int nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }
    
    
    
    
    
    
}
