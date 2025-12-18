/**
 *
 * @author Marcos Einecke
 */


package Aula_004_Herança.Exercicios_01_Midia;
public class Jogo extends Midia{
    
    private String plataforma,classificacao;
    
    
    
    public Jogo(String titulo, String plataforma,String classificacao ) {
        super(titulo,"");
        this.classificacao = classificacao;
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
               
             
        
}
