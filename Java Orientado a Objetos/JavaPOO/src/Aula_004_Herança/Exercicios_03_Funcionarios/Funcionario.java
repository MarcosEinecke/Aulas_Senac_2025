/**
 *
 * @author Marcos Einecke
 */

package Aula_004_Herança.Exercicios_03_Funcionarios;
public class Funcionario {
    
    protected String nome,cargo;
    protected double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
}
