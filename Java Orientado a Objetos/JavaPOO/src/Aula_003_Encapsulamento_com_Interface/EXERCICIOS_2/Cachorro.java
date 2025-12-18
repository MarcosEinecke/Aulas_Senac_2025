/**
 *
 * @author TI
 */
package Aula_003_Encapsulamento_com_Interface.EXERCICIOS_2;

public class Cachorro implements Animal{

    private String nome;
    private int idade;
    private String especie;

    public Cachorro(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String emitirSom() {
        System.out.println("Au! Au!");
    } return 

    
    
    
    
    
    
    
    
}
