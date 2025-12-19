/**
 *
 * @author Marcos Einecke
 */

package Aula_004_Herança.Exercicios_03_Funcionarios;
public class Gerente extends Funcionario{
    
    private String departamento;

    public Gerente(String nome, String cargo, double salario, String departamentop) {
        super(nome, cargo, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
