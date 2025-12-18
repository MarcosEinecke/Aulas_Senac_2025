/**
 *
 * @author Marcos Einecke 
 * 
 * 
 * 
 */

//3

package Aulao_Revisao;
public class Professor extends Pessoa{
    
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
        
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    
    
          
    
    
    
    
    
}
