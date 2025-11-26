
/**
 *
 * @Marcos_Einecke 
 * 
 * 
 */



package Aula_001_Introdução.Exercicio_07;
public class Livro {
    
    
    String titulo,autor;
    int anoPublicado;
    boolean disponivel;
    
    void emprestar (){
        if(disponivel){
            disponivel = false;
            System.out.println("Livro "+titulo+ " emprestado com sucesso.");
        }else{
            System.out.println("Livro "+titulo+" não está diponivel para empréstimo.");            
        }
    }
    
    
    void devolver(){
        if(!disponivel){
            disponivel = true;
            System.out.println("Livro "+titulo+" devolvido com sucesso.");
        }else{
            System.out.println("Livro "+ titulo + " ´já está disponivel.");
        }
    }
    
    
    
}
