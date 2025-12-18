/**
 *
 * @author Marcos Einecke
 */

package Aula_001_Introdução.Exercicio_04;
public class Retangulo {
    
  private    double base;
    private  double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    

    double calcularArea() {
        
        return base * altura;
        
    }

    double calcularPerimetro() {
        
        return 2 * (base + altura);
        
    }
  
    
    
    
    
    
}
