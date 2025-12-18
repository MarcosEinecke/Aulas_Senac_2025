/**
 *
 * @author TI
 */


package Aula_003_Encapsulamento_com_Interface.EXERCICIOS_3;
public class comoCirculo implements FiguraGeometrica{
    
    private double raio;

    public comoCirculo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        
        System.out.println(Math.PI * raio * raio);
        
    }

    @Override
    public void calcularPerimetro() {
        
        System.out.println(2 * Math.PI * raio);
        
    }
}
