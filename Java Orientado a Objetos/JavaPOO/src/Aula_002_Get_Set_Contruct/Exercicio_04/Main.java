/**
 *
 * @author Marcos Einecke
 * 
 * 4. Classe Livro: Crie uma classe Livro com os atributos titulo, autor,
 anoPublicacao e disponivel (booleano). Crie um construtor, métodos getters
 e setters, e os métodos emprestar() e devolver() que alteram o estado do
 atributo disponivel
 * 
 * 
 */

package Aula_002_Get_Set_Contruct.Exercicio_04;
public class Main {
    
    public static void main(String[] args) {
        
        // Criando um novo livro
        Livro livro1 = new Livro("1984", "George Orwell", 1949);
        
        // Exibindo informações iniciais do livro
        System.out.println("=== Informações do Livro ===");
        System.out.println(livro1.toString());
        System.out.println();
        
        // Testando método emprestar
        System.out.println("=== Operação: Emprestar ===");
        livro1.emprestar();
        System.out.println(livro1.toString());
        System.out.println();
        
        // Tentando emprestar novamente (deve falhar)
        System.out.println("=== Tentativa de emprestar novamente ===");
        livro1.emprestar();
        System.out.println();
        
        // Testando método devolver
        System.out.println("=== Operação: Devolver ===");
        livro1.devolver();
        System.out.println(livro1.toString());
        System.out.println();
        
        // Tentando devolver novamente (deve falhar)
        System.out.println("=== Tentativa de devolver novamente ===");
        livro1.devolver();
    }
    
}
