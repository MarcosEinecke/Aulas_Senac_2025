
/**
 *
 * @author Marcos Einecke
 * ligar()
 * abrirMenu()
 * maisvolume()
 * 
 * 
 */


package Aula_003_Encapsulamento_com_Interface_Exemplo_ControleRemoto;
public interface Controlador {
    // Aqui são como se fossem os "Botões"  do controle
    
   public abstract void ligar(); 
   public abstract void desligar(); 
   public abstract void abrirMenu();        
   public abstract void fecharMenu();
   public abstract void maisVolume();
   public abstract void menosVolume();
   public abstract void ligarMudo();
   public abstract void desligarMudo();
   public abstract void play();
   public abstract void pause();
   
   
   
   
            
    
}
