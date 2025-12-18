

/**
 *
 * @author TI
 */


package Aula_003_Encapsulamento_com_Interface_Exemplo_ControleRemoto;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        
        ControleRemoto cr = new ControleRemoto();
        Scanner sc = new Scanner(System.in);
        
        int opcao;
        
        
        do{
            System.out.println("\n -- MENU DO CONTROLE REMOTE  --");
            System.out.println("1. Ligar");
            System.out.println("2. Desligar");
            System.out.println("3. Abrir Menu");
            System.out.println("4. Fechar Menu");
            System.out.println("5. Aumentar Volume");
            System.out.println("6. Diminuir Volume");
            System.out.println("7. Ligar Mudo");
            System.out.println("8. Desligar Mudo");
            System.out.println("9. Play");
            System.out.println("10.Pause ");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            
            switch (opcao){
                case 1: cr.ligar();break;
                case 2: cr.desligar();break;
                case 3: cr.abrirMenu();break;
                case 4: cr.fecharMenu();break;
                case 5: cr.maisVolume();break;
                case 6: cr.menosVolume();break;
                case 7: cr.ligarMudo();break;
                case 8: cr.desligarMudo();break;
                case 9: cr.play();break;
                case 10: cr.pause();break;
                case 0: System.out.println("Encerrando . . . ");break;
                default: System.out.println("Opção inválida.");
                     
            }
            
                        
                                    
            
            
            
        }while(opcao != 0);   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //COMANDOS SEM INTERAÇÃO DO USUÁRIO
        cr.desligar();
        cr.abrirMenu();
                                                  
        
               
    }
         
    
            
}
