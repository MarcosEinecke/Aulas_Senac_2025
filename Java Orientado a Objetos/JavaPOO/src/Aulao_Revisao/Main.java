/**
 *
 * @author Marcos Einecke
 * 
 * 
 */



package Aulao_Revisao;

import java.util.Scanner;
import Limpa_Tela.LimpaTela;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();
        
        
        System.out.println("Digite a matricula do aluno: ");
        String matricula = sc.nextLine();
        
        
        LimpaTela.limpaTela();
        
        AlunoAvaliavel aluno = new AlunoAvaliavel (nomeAluno,matricula);
        
        System.out.println("Digite a nota final do aluno (0 a 10) ");
        double nota = sc.nextDouble();
        sc.nextLine();
        
        aluno.setNotaFinal(nota);   
            
        
        System.out.println(aluno);
        System.out.println("Avaliação: "+aluno.avaliarDesempenho());
        
        System.out.println("\nDigite o nome do professor: ");
        String nomeProf = sc.nextLine();
        
        System.out.println("Digite a idade do professor: ");
        int idade = sc.nextInt();
        
        
        System.out.println("Digite a disciplina do professor: ");
        String disciplina = sc.nextLine();
        sc.nextLine();
        
        
        
        
        ProfessorAvaliavel prof = new ProfessorAvaliavel(nomeProf,idade,disciplina);
        
        System.out.println("Professor: "+prof.getNome()+", Disciplina: "+prof.getDisciplina());
        System.out.println("Avalição: "+prof.avaliarDesempenho());
        
 
        
        
        
        
        
//         AlunoAvaliavel aluno = new AlunoAvaliavel("Carlos","A123");
//         aluno.setNotaFinal(8.5);
//         System.out.println(aluno);
//         System.out.println("Avaliação: " + aluno.avaliarDesempenho());
//         
//         
//         
//         ProfessorAvaliavel prof = new ProfessorAvaliavel("Ana",40,"Matemática");
//         System.out.println("Professor: "+prof.getNome()+", Disciplina: "+prof.getDisciplina());
//         System.out.println("Avalição: "+prof.avaliarDesempenho());
//         
//         
              
        
        
        
        
        
        
        
        
        
    }
    
    
}
