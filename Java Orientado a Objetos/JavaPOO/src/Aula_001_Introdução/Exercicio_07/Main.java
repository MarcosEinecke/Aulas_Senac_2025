/**
 *
 * @Marcos_Einecke
 *
 * Crie uma classe Livro com os atributos titulo (String), autor (String), anoPublicacao
 *(int) e disponivel (boolean). Crie os métodos emprestar() e devolver() que alteram o
 *estado de disponibilidade do livro.
 *
 */
package Aula_001_Introdução.Exercicio_07;

public class Main {

    public static void main(String[] args) {

        Livro livro1 = new Livro();
        livro1.titulo = "Dom Quixote";
        livro1.autor = "Miguel de Cervantes";
        livro1.anoPublicado = 1605;
        
        //livro1.disponivel = false; //Livro Não Disponivel
        livro1.disponivel = true;// Livro Disponivel
        
        
        //livro1.emprestar();
        //livro1.devolver();
        
    
    }

}
