


/**
 *
 * @Marcos_Einecke
 * 
 * 
*3. Verificar Contém:
*Crie um ArrayList de strings, adicione três cores ("Vermelho", "Verde", "Azul"), verifique se a cor "Amarelo" está na lista e imprima o resultado.

 * 
 */



package Aula_08_ARRAYLIST.EXERCICIOS;
public class Exercicio_3_ArrayList {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();

        System.out.println("VAMOS CRIAR UM ARRAYLIST DE CORES");
        System.out.println();

        // Criando o ArrayList de strings
        java.util.ArrayList<String> lista_cores = new java.util.ArrayList<>();

        lista_cores.add("Vermelho");
        lista_cores.add("Verde");
        lista_cores.add("Azul");

        // Verificando se "Amarelo" está na lista
        boolean contem_amarelo = lista_cores.contains("Amarelo");

        System.out.println("A cor 'Amarelo' está na lista? " + contem_amarelo);
        System.out.println();
        System.out.println();

    }
    
    
}
