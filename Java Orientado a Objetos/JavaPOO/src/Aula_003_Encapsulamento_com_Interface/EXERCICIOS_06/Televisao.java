/**
 *
 * @author Marcos Einecke
 */


package Aula_003_Encapsulamento_com_Interface.EXERCICIOS_06;

    
    public class Televisao implements DispositivoEletronico{
    
    private boolean ligado;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("A TV foi Ligado");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("A TV foi desligada");
    }

    @Override
    public void obterStatus() {
        String status = ligado ? "TV Ligada" : "TV Desligada";
        System.out.println(status);
    }
  
}

    
    
    

