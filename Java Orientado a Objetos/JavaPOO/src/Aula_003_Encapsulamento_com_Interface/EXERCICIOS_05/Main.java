/**
 *
 * @author Marcos Einecke
 * 
 */

package Aula_003_Encapsulamento_com_Interface.EXERCICIOS_05;
public class Main {
    
    public static void main(String[] args) {
        
        FuncionarioHorista fh1 = new FuncionarioHorista("Ruan","Zelador",16);
        FuncionarioAssalariado fa1 = new FuncionarioAssalariado("Kelvin","Clash Royale",19);
        
        fh1.calcularPagamento();
        fa1.calcularPagamento();
        
    }

    
    
    
}
