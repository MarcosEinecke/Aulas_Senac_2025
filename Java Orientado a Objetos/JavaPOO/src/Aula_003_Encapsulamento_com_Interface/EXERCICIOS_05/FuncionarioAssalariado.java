/**
 *
 * @author Marcos Einecke
 */

package Aula_003_Encapsulamento_com_Interface.EXERCICIOS_05;
public class FuncionarioAssalariado {
    
      private String nome,funcao;
    private int idade;
    
    public void fazerAniversario(){
        
        this.idade ++;
        
    }

    public FuncionarioAssalariado(String nome, String funcao, int idade) {
        this.nome = nome;
        this.funcao = funcao;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void calcularPagamento() {
     
        System.out.println(52.82 * 24);
        
    }

    
    
    
}
