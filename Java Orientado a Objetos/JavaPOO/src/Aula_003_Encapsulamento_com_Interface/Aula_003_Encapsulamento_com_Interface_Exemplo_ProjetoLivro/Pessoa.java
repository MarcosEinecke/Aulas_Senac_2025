/**
 *
 * @author Marcos Einecke
 */

package Aula_003_Encapsulamento_com_Interface_Exemplo_ProjetoLivro;
public class Pessoa {
    private String nome,sexo;
    private int idade;
    
    
    //Método Específico

public void fazerAniversario(){
    this.idade ++;
    
}    

//Métodos Especiais 

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    
    
    
    
    
    
    
    
    
}
