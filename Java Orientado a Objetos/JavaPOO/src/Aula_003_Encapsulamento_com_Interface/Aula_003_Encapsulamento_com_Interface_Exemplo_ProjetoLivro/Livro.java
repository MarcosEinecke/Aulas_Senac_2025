/**
 *
 * @author Marcos Einecke
 */

package Aula_003_Encapsulamento_com_Interface_Exemplo_ProjetoLivro;
public class Livro implements LivroFisico{
    
    private String titulo,autor;
    private int totalPaginas,paginaAtual;
    private boolean aberto;
    private Pessoa leitor; 
    
    
    //Detalhes

  
    public String detalhes() {
        return "Livro: " + titulo +
                "\nAutor: " + autor + 
                "\nTotal de Páginas: " + totalPaginas + 
                "\nPágina Atual: " + paginaAtual + 
                "\nO livro está aberto? " + (this.getAberto() ? "Sim" : "Não")+
                "\nLeitor: " + leitor.getNome() +
                "\nIdade: " +leitor.getIdade() +
                "\nSexo: " +leitor.getSexo();
    }
    
    
    
    
    
    
    
    //Construtor 
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        //this.paginaAtual = paginaAtual;
        //this.aberto = aberto;
        this.leitor = leitor;
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

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    
        
       
    
    

    @Override
    public void abrir() {
        this.aberto = true;
        System.out.println("O livro está aberto");
    }

    @Override
    public void fechar() {
        this.aberto = false;
        System.out.println("O livro foi fechado");
    }

    @Override
    public void folhear(int p) {
        if(p > this.totalPaginas){
            this.paginaAtual = 0;
        }else {
            this.paginaAtual = p;
        }
        
    }

   


    @Override
    public void voltarPegina() {
        this.paginaAtual --;
        System.out.println("Voltando a página.");
    }

    @Override
    public void avancarPegina() {
        this.paginaAtual ++;
        System.out.println("Avançando para próxima página.");
    }
    
    
    
}
