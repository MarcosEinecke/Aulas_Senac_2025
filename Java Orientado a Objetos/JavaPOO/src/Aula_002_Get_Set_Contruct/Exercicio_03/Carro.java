/**
 *
 * @author Marcos Einecke
 * 
 * 
 */

package Aula_002_Get_Set_Contruct.Exercicio_03;
public class Carro {
    
 private  String marca;
 private  String modelo;
 private  int ano;
 private boolean ligado;

    public Carro(String marca, String modelo, int ano, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = ligado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
 
    
    public void ligar () {
        
        boolean ligado = true;
        
        System.out.println("\nSEU CARRO ESTÁ BATENDO CHAVE....");
        System.out.println("SEU CARRO ESTÁ BATENDO CHAVE....");
        System.out.println("SEU CARRO ESTÁ BATENDO CHAVE....");
        System.out.println("\n SEU CARRO LIGOU,NÃO VAI PRECISAR EMPURRAR ESSA NABA (: ");
        System.out.println("BRUM BRUM BRUM ");
        System.out.println("BRUM BRUM BRUM ");
        
    } 
    
    
    public void desligar(){
        
        
        boolean deligado = false;
        
        System.out.println("SEU CARRO ESTÁ BATENDO CHAVE....");
        System.out.println("SEU CARRO ESTÁ BATENDO CHAVE....");
        System.out.println("SEU CARRO ESTÁ BATENDO CHAVE....");
        System.out.println("\n NÃO FUNCIONOU,VAI TER QUE EMPURAR O CARRO ): ");
    }
    
    
}
