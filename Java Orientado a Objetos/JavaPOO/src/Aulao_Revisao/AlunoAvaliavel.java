/**
 *
 * @author Marcos Einecke
 */


package Aulao_Revisao;
public class AlunoAvaliavel extends Aluno implements Avaliavel{

    public AlunoAvaliavel(String nome, String matricula) {
        super(nome, matricula);
    }

    
    
    
    
    @Override
    public String avaliarDesempenho() {
        if (getNotaFinal() >= 7) {
            return "Aprovado com bom desempenho.";
        }else{
            return "Precisa melhorar o desempenho.";
        }
    }
    
    

    
    
}
