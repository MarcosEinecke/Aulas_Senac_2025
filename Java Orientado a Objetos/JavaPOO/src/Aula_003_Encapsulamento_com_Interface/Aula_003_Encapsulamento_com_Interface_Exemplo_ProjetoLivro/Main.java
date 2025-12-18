/**
 *
 * @author Marcos Einecke
 */


package Aula_003_Encapsulamento_com_Interface_Exemplo_ProjetoLivro;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println(" --- CRIANDO O LEITOR ---");
        System.out.println("Digite o nome da Pessoa: ");
        String nomePessoa =  sc.nextLine();
        
        
        
        System.out.println("Digite a idade: ");
        int idadePessoa = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Digite o sexo (M/F): ");
        String sexoPessoa = sc.nextLine();
        
        
        
        //Criação do objeto Pessoa com os dados digitados
        Pessoa p1 = new Pessoa (nomePessoa, sexoPessoa, idadePessoa);
        
        
               
        System.out.println("\n --- CRIANDO O LIVRO ---");
        System.out.println("Digite o títula do Livro: ");
        String tituloLivro = sc.nextLine();
        
        System.out.println("Digite o autor do livro: ");
        String autorLivro = sc.nextLine();
        
        System.out.println("Digite o total de páginas: ");
        int totalPaginas = sc.nextInt();
        sc.nextLine();
        
        
        
        
        
        //Criar o objeto Livro, passando a Pessoa(p1) criada acima como leitora
        
        Livro L1 = new Livro(tituloLivro,autorLivro,totalPaginas,p1);
        


        boolean executando = true;
        
        
        
        while(executando){
            System.out.println("    MENU DO LIVRO: "+ L1.getTitulo());
            System.out.println("1. Abrir livro");
            System.out.println("2. Fechar livro");
            System.out.println("3. Folhear (ir para a página x)");
            System.out.println("4. Avançar página");
            System.out.println("6. Voltar página");
            System.out.println("0. Sair");
            System.out.println("\nEscolha uma opção: ");
            
            
            int opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    L1.abrir();
                    System.out.println("Você abriu o livro");
                    break;
                case 2:
                    L1.fechar();
                    System.out.println("Você fechou o livro");
                    break;
                case 3:
                    System.out.println("Para qual página quer ir?");
                    int pag = sc.nextInt();
                    L1.folhear(pag);
                    System.out.println("Você folheou até a página "+L1.getPaginaAtual());
                case 4:
                    L1.avancarPegina();
                    System.out.println("Página avançada.Atual: ");
                case 5:
                    L1.voltarPegina();
                    System.out.println("Página voltada.Atual: "+L1.getPaginaAtual());
                    break;
                case 6:
                    System.out.println(L1.detalhes());
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
                    
                                        
            }
            
            
            
        }
        
        
        
        
        
        
        
            
        
        
        
        
        
    
    //SEM INTERAÇÃO 
//    Pessoa [] p = new Pessoa [2];// 0 1
//    Livro [] l = new Livro [3]; // 0 1 2
//    
//    p[0]  = new Pessoa ("Luis","M",22);
//    p[1]  = new Pessoa ("Perigo","M",18);
//    
//    
//    l[0] = new Livro ("Java para iniciantes","Roberto Heus",150,p[0]);
//    l[1] = new Livro ("Harry Potter","JK Rooling",800,p[1]);
//    l[2] = new Livro ("O iluminado","Stephen King",659,p[1]);
//    
//    l[0].abrir();
//    l[0].folhear(50);
//    l[0].avancarPegina();
//        System.out.println("\n"+l[0].detalhes());
//    
//    
    
    
    }
    
}
