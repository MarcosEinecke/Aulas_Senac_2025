/**
 *
 * @author Marcos Einecke
 */

package Aula_004_Herança.Exemplos_2;
public class Leitor extends Usuario{
    
    
    private String [] historicoLeitor;
    
    public Leitor(String nome, String login,String [] historicoLeitor) {
        super(nome, login);
        this.historicoLeitor = historicoLeitor;
        
    }

    public String[] getHistoricoLeitor() {
        return historicoLeitor;
    }

    public void setHistoricoLeitor(String[] historicoLeitor) {
        this.historicoLeitor = historicoLeitor;
    }
    
    
    
    
}
