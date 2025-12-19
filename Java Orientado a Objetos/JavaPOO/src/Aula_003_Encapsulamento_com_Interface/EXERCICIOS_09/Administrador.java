/**
 *
 * @author Marcos Einecke
 */

package Aula_003_Encapsulamento_com_Interface.EXERCICIOS_09;
public class Administrador implements ContaUsuario{
    
    private String nome;
    private int idUsuario;

    public Administrador(String nome, int idUsuario) {
        this.nome = nome;
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public void acessarSistema() {
        System.out.println("Acessando sistema . . .");
    }

    @Override
    public void realizarOperacao() {
        System.out.println("Acesso negado!");
    }
}
