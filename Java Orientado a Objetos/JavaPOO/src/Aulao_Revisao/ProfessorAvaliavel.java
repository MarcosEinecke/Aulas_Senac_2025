/**
 *
 * @author Marcos Einecke
 * 
 */

package Aulao_Revisao;
public class ProfessorAvaliavel extends Professor implements Avaliavel {

    public ProfessorAvaliavel(String nome, int idade,String disciplina ) {
        super(nome, idade,disciplina);
       
    }

    
        
    
    
    @Override
    public String avaliarDesempenho() {
        
        return "Desempenho avaliado conforme feedback dos alunos.";       
        
    }
    
    

    
    
}
