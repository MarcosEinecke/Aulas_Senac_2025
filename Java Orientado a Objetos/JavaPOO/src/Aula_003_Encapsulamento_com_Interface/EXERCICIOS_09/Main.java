/**
 *
 * @author Marcos Einecke
 */

package Aula_003_Encapsulamento_com_Interface.EXERCICIOS_09;
public class Main {
    
    public static void main(String[] args) {
        
        Administrador adm = new Administrador("Perigo",67);
        
        adm.getNome();
        adm.getIdUsuario();
        adm.acessarSistema();
        adm.realizarOperacao();
        
        UsuarioComun uc = new UsuarioComun("Ruan",12345);
        
        uc.getNome();
        uc.getIdUsuario();
        uc.realizarOperacao();
        uc.acessarSistema();
        
    }
    
}
