/**
 *
 * @author Marcos Einecke
 */
package Aula_001_Introdução.Exercicio_06;

public class Funcionario {

    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    void aumentarSalario(double percentual) {

        salario += salario * (percentual / 100);

    }

    void novoSalario() {

        System.out.println("Nome: " + nome + " ,Salario: " + salario + " ,Departamento: " + departamento);

    }

}
