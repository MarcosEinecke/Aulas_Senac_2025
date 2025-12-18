/**
 *
 * @author Marcos Einecke
 *
 * 1. Mídias
 * Crie uma classe Mídia com os atributos título e duração.
 * Crie subclasses Música, Filme e Jogo que herdam de Mídia e adicionam seus próprios atributos específicos:
 * - Música: artista e álbum
 * - Filme: diretor e gênero
 * - Jogo: plataforma e classificação
 *
 *
 */
package Aula_004_Herança.Exercicios_01_Midia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Musica m1 = new Musica("Pescador", "2 minutos e 59 segundos", "Armandinho", "Casinha");
        Filme f1 = new Filme("Harry Potter - Pedra Filosofal", "2h e 32m ", "Chris Columbus", "Fantasia/Infantil");
        Jogo j1 = new Jogo("Battlefield 6", "PC,PlayStation 5 e Xbox Series X/S", "16 anos");

        boolean executando = true;

        while (executando) {

            System.out.println("\n  ##   DESAPEGANDO  ##");
            System.out.println("");
            System.out.println("");

            System.out.println("1. MÚSICA(CD)  ");
            System.out.println("2. FILME   ");
            System.out.println("3. JOGO    ");
            System.out.println("4. SAIR    ");
            System.out.print("OP = ");
            int op = sc.nextInt();

            switch (op) {

                case 1:

                    for (int i = 0; i < 100; i++) {
                        System.out.println("");
                    }
                    System.out.println("\nMÚSICA FAVORITA:  " + m1.titulo + "\nDURAÇÃO DA MÚSCIA: " + m1.duracao + "\nARTISTA: " + m1.getArtista() + "\nALBUM: " + m1.getAlbum());

                    break;

                case 2:

                    for (int i = 0; i < 100; i++) {
                        System.out.println("");
                    }

                    System.out.println("\nDVD DO  " + f1.titulo + "\nDURAÇÃO DO FILME: " + f1.duracao + "\nDIRETOR: " + f1.getDiretor() + "\nGÊNERO: " + f1.getGenero());

                    break;

                case 3:

                    for (int i = 0; i < 100; i++) {
                        System.out.println("");
                    }

                    System.out.println("\nJOGO:  " + j1.titulo + "\nDURAÇÃO DA CAMPANHA: " + j1.duracao + "\nPLATAFORMA: " + j1.getPlataforma() + "\nClassificação Indicativa: " + j1.getClassificacao());

                    break;

                case 4:
                    
                    
                    

                    break;

                default:

                    break;

            }

        }

    }
}
