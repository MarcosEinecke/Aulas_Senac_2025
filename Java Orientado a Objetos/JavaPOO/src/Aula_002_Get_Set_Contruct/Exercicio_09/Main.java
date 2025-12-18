/**
 *
 * @author Marcos Einecke
 * 
 * 9. Classe Funcionário: Crie uma classe Funcionario com os atributos nome,
salario e departamento. Crie um construtor, métodos getters e setters, e um
método aumentarSalario(double percentual) que aumenta o salário do
funcionário pelo percentual fornecido
 * 
 * 
 * 
 */


package Aula_002_Get_Set_Contruct.Exercicio_09;
public class Main {
    
    
     public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario("Marcola",1750.00,"Aviozinho");
        //funcionario1.nome = "Perigo";
        //funcionario1.salario = 1267.00;
        //funcionario1.departamento = "Aviazinho";
        funcionario1.aumentarSalario(5);
        
        funcionario1.novoSalario();
        
    }

    
    
    
}
