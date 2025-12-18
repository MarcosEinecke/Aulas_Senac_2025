/**
 *
 * @author Marcos Einecke
 * 
 */

package Aula_002_Get_Set_Contruct.Exercicio_04;
public class Livro {
    
    private String titulo;
    private String autor;
    private int anoPublicado;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    // Métodos emprestar e devolver conforme requisito
    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("Livro '" + this.titulo + "' emprestado com sucesso!");
        } else {
            System.out.println("Livro '" + this.titulo + "' não está disponível para empréstimo.");
        }
    }
    
    public void devolver() {
        if (!this.disponivel) {
            this.disponivel = true;
            System.out.println("Livro '" + this.titulo + "' devolvido com sucesso!");
        } else {
            System.out.println("Livro '" + this.titulo + "' já está disponível.");
        }
    }
    
    // Método toString para exibir informações facilmente
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicado=" + anoPublicado +
                ", disponivel=" + disponivel +
                '}';
    }
}
