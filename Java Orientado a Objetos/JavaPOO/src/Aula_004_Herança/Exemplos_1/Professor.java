/**
 *
 * @author Marcos Einecke
 */


package Aula_004_Herança_Exemplos_1;
public class Professor  extends Pessoa {
    
    
    private String disciplina;

    public Professor(String nome, String endereco, int idade,String disciplina) {
        super(nome, endereco, idade);
        this.disciplina = disciplina;
            }
    
    
    
    
    
}
