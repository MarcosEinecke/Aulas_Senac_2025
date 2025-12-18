
package Aula_002_Get_Set_Contruct.Exercicio_01;

/**
 *
 * @Marcos Einecke
 * 
 * 1. Classe Pessoa: Crie uma classe Pessoa com os atributos nome, idade e
 altura. Crie um construtor que inicialize esses atributos e métodos getters
 para acessá-los.
 * 
 */



public class Main {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Marcos",25,1.79);
        
        System.out.println("\nInformações da  Pessoa:");
        System.out.println("Nome: "+p1.getNome());
        System.out.println("Nome: "+p1.getIdade());
        System.out.println("Nome: "+p1.getAltura());
        
        
        
        
    }
    
}
