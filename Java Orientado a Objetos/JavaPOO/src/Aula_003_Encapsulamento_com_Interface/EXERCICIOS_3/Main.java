/**
 *
 * @author Marcos Einecke
 * 
 * 3. Figura Geométrica: Crie uma interface FiguraGeometrica com os métodos
calcularArea() e calcularPerimetro(). Implemente essa interface em classes
comoCirculo e Retangulo.
 * 
 */



package Aula_003_Encapsulamento_com_Interface.EXERCICIOS_3;
public class Main {
    
 public static void main(String[] args) {
        
        comoCirculo circulo1 = new comoCirculo(360);
        
        circulo1.calcularArea();
        circulo1.calcularPerimetro();
        
        Retangulo retangulo1 = new Retangulo(96.20,100.50);
        
        retangulo1.calcularArea();
        retangulo1.calcularPerimetro();
        
    }

     
    
}
