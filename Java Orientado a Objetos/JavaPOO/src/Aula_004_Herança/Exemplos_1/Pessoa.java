/**
 *
 * @author Marcos   Einecke 
 * 
 * Exemplo 1: Crie uma classe Pessoa com os atributos nome, idade e endereco. 
 * Crie subclasses Aluno, Professor e Funcionario que herdam de Pessoa e 
 * adicionam seus próprios atributos específicos (matricula para Aluno, disciplina para Professor, cargo para Funcionario).

 * 
 * 
 */

package Aula_004_Herança_Exemplos_1;

public class Pessoa { // CLASSE HERENÇA "MÃE"(SUPERCLASSE)
    
    protected String nome,endereco;
    protected int idade;

    public Pessoa(String nome, String endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }
    
    
    
    
    
    
    
    
    
    
}
