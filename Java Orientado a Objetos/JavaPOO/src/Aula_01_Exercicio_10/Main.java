/**
 *
 * @Marcos_Einecke
 * 
 * 10. Crie uma classe Ponto com os atributos x (int) e y (int) que representam as 
 *coordenadas de um ponto no plano cartesiano. Crie um método 
 *calcularDistancia(Ponto outroPonto) que calcula a distância entre o ponto atual e 
 *outro ponto passado como parâmetro. 
 * 
 */


package Aula_01_Exercicio_10;

public class Main {
    public static void main(String[] args) {
        Ponto ponto1 = new Ponto(); //Criando objeto
        ponto1.x = 1;
        ponto1.y = 3;
        
        
        Ponto ponto2 = new Ponto ();
        ponto2.x = 4;
        ponto2.y = 6;
        
        
        double distancia = ponto1.calcularDistancia(ponto2);
        System.out.println("A distância entro os pontos é: "+distancia);
        
        
    }
    
}
