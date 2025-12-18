/**
 *
 * @author Marcos Einecke
 *
 *
 */
package Aula_004_Herança_Exemplos_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Aluno a1 = new Aluno("Marcos", "Nova Nordeste - Imbé", 25, 123456);
//        Professor p1 = new Professor("Luis", "Av. Fernandes Bastos", 31, "Java POO");
//        Funcionario f1 = new Funcionario("Perigo", "Av. Maria Joana", 18, "Técnico De Informática");
//
//        System.out.println("Aluno: " + a1.nome + " " + a1.idade);
//        System.out.println("Professor: " + p1.nome + " " + p1.idade);
//        System.out.println("Funcionário " + f1.nome + " " + f1.idade);

        

        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite os dados dos aluno: ");
        System.out.println("Nome:  ");
        String nomeAluno = sc.nextLine();
        System.out.println("Idade: ");
        int idadeAluno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enderço: ");
        String enderecoAluno = sc.nextLine();
        System.out.println("Matrícula:  ");
        int matricula = sc.nextInt();
        Aluno aluno = new Aluno (nomeAluno,enderecoAluno,idadeAluno,matricula);
        
        
        
        
        //Professor
        
       
        System.out.println("\nDigite os dados dos professor: ");
        System.out.print("\nNome:  ");
        String nomeProfessor = sc.nextLine();
        sc.nextLine();
        System.out.print("\nIdade: ");
        int idadeProfessor = sc.nextInt();
        sc.nextLine();
        System.out.print("\nEnderço: ");
        String enderecoProfessor = sc.nextLine();
        System.out.print("\nDisciplina:  ");
        String disciplina = sc.nextLine();
        Professor professor = new Professor (nomeProfessor,enderecoProfessor,idadeProfessor,disciplina);
        
        
        
                
        //Funcionário
        
       
        System.out.println("\nDigite os dados dos funcionário: ");
        System.out.print("Nome:  ");
        String nomeFuncionario = sc.nextLine();
        System.out.print("Idade: ");
        int idadeFuncionario = sc.nextInt();
        sc.nextLine();
        System.out.print("Enderço: ");
        String enderecoFuncionario = sc.nextLine();
        System.out.print("Matrícula:  ");
        String setor = sc.nextLine();
        Funcionario funcionario = new Funcionario (nomeFuncionario,enderecoFuncionario,idadeFuncionario,setor);
        
        //Exibição
        
        System.out.println("\n ## Dados Cadastrados ##");
        System.out.println("Aluno:  "+ aluno.nome + "\nIdade: " + aluno.idade);
        System.out.println("\nProfessor: "+ professor.nome + "\nIdade: " + professor.idade);
        System.out.println("\nFuncionário:  "+ funcionario.nome+ "\nIdade: " + funcionario.idade);
        




        
        
        
        
        
        
    }

}
