/**
 *
 * @author Marcos Einecke
 */


package Aula_004_Herança.Exemplos_2;
public class Editor extends Usuario{

    private String [] permissoes;
    
    
    public Editor(String nome, String login,String []permissoes) {
        super(nome, login);
        this.permissoes = permissoes;
    }

    public String[] getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(String[] permissoes) {
        this.permissoes = permissoes;
    }

 
    
    
    
}
