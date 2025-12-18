/**
 *
 * @author Marcos Einecke
 *
 *
 */
package Aulao_Revisao;

public class Aluno {

    private String nome, matricula;
    private double notaFinal;

    
    
    //1
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        if (notaFinal >= 0 && notaFinal <= 10) {
            this.notaFinal = notaFinal;
        }else{
            System.out.println("Nota inválida. Deve estar entre 0 e 10.");
        }
    }

    
    
    //2
    @Override
    public String toString() {
        return "Aluno: "  + nome + 
                ", Matricula: " + matricula + 
                ", Nota Final: " + notaFinal;
    }
    
    
    
    
    
    
    
}
