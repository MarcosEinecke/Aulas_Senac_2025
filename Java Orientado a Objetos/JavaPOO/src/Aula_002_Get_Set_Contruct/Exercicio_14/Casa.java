/**
 *
 * @author Marcos Einecke
 * 
 * 
 */

package Aula_002_Get_Set_Contruct.Exercicio_14;
public class Casa {
    
    private int numero;
    private String cor;
    private Pessoa proprietario;

    public Casa(int numero, String cor, Pessoa proprietario) {
        this.numero = numero;
        this.cor = cor;
        this.proprietario = proprietario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    
}
 
    
    // Classe Pessoa
     class Pessoa {
        
         private String nome;
         
         //Construtor da Pessoa
        public Pessoa(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
        
        
        
    }
    
    
    
    
    

