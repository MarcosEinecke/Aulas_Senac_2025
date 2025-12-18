/**
 *
 * @author Marcos Einecke
 */

package Aula_003_Encapsulamento_com_Interface.EXERCICIOS_06;

public class Main {
    
    public static void main(String[] args) {
        
        Televisao tv = new Televisao();
        tv.ligar();
        tv.obterStatus();
        
        Radio ra = new Radio();
        ra.ligar();
        ra.desligar();
        ra.obterStatus();
        
        Celular ce =new Celular();
        ce.ligar();
        ce.desligar();
        ce.ligar();
        ce.obterStatus();
        
    }
    
}
