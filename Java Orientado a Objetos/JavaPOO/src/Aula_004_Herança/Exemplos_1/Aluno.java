/**
 *
 * @author Marcos
 */

package Aula_004_Herança_Exemplos_1; //SUBCLASSE  "FILHA" 
public class Aluno extends Pessoa {
    
    
    private int matricula;
    
    
    
    
    public Aluno(String nome, String endereco, int idade,int matricula) {
        super(nome, endereco, idade);
        this.matricula = matricula;
        
    }
    
    
    
    
    
    
    
    
    
}
