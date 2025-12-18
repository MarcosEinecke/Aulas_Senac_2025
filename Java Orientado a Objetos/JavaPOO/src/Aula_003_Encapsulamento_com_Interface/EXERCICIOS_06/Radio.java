/**
 *
 * @author Marcoos Einecke
 */


package Aula_003_Encapsulamento_com_Interface.EXERCICIOS_06;
public class Radio implements DispositivoEletronico{
    
    private boolean ligado;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("O Radio foi ligado");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("O Radio foi desligado");
    }

    @Override
    public void obterStatus() {
        String status = ligado ? "Radio Ligada" : "Radio Desligada";
        System.out.println(status);
    }
    
}
