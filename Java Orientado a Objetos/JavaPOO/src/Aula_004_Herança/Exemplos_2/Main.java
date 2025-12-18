/**
 *
 * @author Marcos Einecke
 *
 * Exemplos 2: Crie uma classe Usuario com os atributos nome
 * e login. Crie subclasses Administrador, Editor e Leitor que herdam de Usuario
 * e adicionam seus próprios atributos e métodos específicos (nível de acesso
 * para Administrador, permissões de edição para Editor, histórico de leitura
 * para Leitor).
 *
 */
package Aula_004_Herança.Exemplos_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println(" # CRIAR A CONTA DO LEITOR #");

        System.out.print("Digite o nome do Leitor: ");
        String nome = teclado.nextLine();
        System.out.print("Digite o Login: ");
        String login = teclado.nextLine();

        //Para preparar o array primeiroprecisamos asber o tamanho da lista
        System.out.println("Quantas categorias favoritas deseja adicionar? (Digite um número)");
        int quantidade = teclado.nextInt();
        teclado.nextLine();

        //Criar a "caixa" (array) com o tamanho que o utilizar escolheu
        //minhaCategoria contém os livros do historicoDoLeitor, onde ele poderá escolher
        String[] minhasCategorias = new String[quantidade];

        //preencher o array usando um for
        for (int i = 0; i < quantidade; i++) {

            System.out.println("Digite a categoria n° " + (i + 1) + ":");
            //Guardar o que for digitado na posição[i] do array
            minhasCategorias[i] = teclado.nextLine();

        }

        // Criar o objeto todos os dados escolhidos
        Leitor leitor = new Leitor(nome, login, minhasCategorias);

        //mostrar resultados
        System.out.println(" # RESULTADO #");
        System.out.println("Leitor criado: " + leitor.nome);
        System.out.println("Categorias: " + String.join(",", leitor.getHistoricoLeitor()));


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //SEM SCARNNER
//        Administrador admin = new Administrador ("Isaac","admin",10);
//        Editor editor = new Editor("Cicero","editor_cicero",new String []{"publicar","editar"});
//        Leitor leitor = new  Leitor ("Ryan","Leitor_ryan",new String [] {"MySQL","Java POO"});
//        
//        
//        System.out.println("\nAdministrador: "+admin.nome+ "\nNível de Acesso: "+ admin.getNivelDeAcesso());
//        System.out.println("\nEditor: "+editor.nome+"\nLogin: "+editor.login);
//        System.out.println("\nLeitor: "+leitor.nome+"\nHistórico do Leitor: "+String.join(" , ",leitor.getHistoricoLeitor()));
//        
//        
//        
//        
//        
    }

}
