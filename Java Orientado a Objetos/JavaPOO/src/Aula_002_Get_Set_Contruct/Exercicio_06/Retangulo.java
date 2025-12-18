/**
 *
 * @author Marcos Einecke
 *
 */
package Aula_002_Get_Set_Contruct.Exercicio_06;

public class Retangulo {

    private double Largura;
    private double Altura;

    public Retangulo(double Largura, double Altura) {
        this.Largura = Largura;
        this.Altura = Altura;
    }

    public double getLargura() {
        return Largura;
    }

    public void setLargura(double Largura) {
        this.Largura = Largura;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    double calcularArea() {

        return Largura * Altura;

    }

    double calcularPerimetro() {

        return 2 * (Largura + Altura);

    }

}
