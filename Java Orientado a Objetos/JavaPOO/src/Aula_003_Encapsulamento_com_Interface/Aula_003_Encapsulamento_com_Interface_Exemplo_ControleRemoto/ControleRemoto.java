/**
 *
 * @author Marcos Einecke
 *
 *
 *
 */
package Aula_003_Encapsulamento_com_Interface_Exemplo_ControleRemoto;

public class ControleRemoto implements Controlador {

    //Atributos    
    private int volume;
    private boolean ligado;
    private boolean passandoPrograma;

    //Métodos Especiais
    //Construtor 
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.passandoPrograma = true;

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getPassandoPrograma() {
        return passandoPrograma;
    }

    public void setPassandoPrograma(boolean passandoPrograma) {
        this.passandoPrograma = passandoPrograma;
    }

    //Métodos abstratos
    @Override //Substituir 
    public void ligar() {
        if (!this.getLigado()) {
            this.setPassandoPrograma(false);
            System.out.println("TV ligada.");
        }

    }

    @Override
    public void desligar() {
        if (this.getLigado()) {
            this.setPassandoPrograma(false);
            this.setLigado(false);
            this.setVolume(0);
            System.out.println("TV desligada.");
        }
    }

    @Override
    public void abrirMenu() { //Status
        System.out.println("A TV está ligada? " + (this.getLigado() ? "Sim" : "Não"));
        System.out.println("Está passando algum program? " + (this.passandoPrograma ? "Sim" : "Não"));
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print("|");

            //Volume: ||||||||||||||||            
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu ......");

    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 10);
        }

    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 10);
        }

    }

    @Override
    public void ligarMudo() {
        //Se a TV estiver ligada e o volume for maior que zero
        // O volume será definido em 0 (zero)
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
            System.out.println("Mudo está ligado.");
        }

    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(50);// Referente ao último volume colocado
        }

    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getPassandoPrograma())) {
            this.setPassandoPrograma(true);
            System.out.println("Reproduzindo o programa.");
        } else {
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getPassandoPrograma()) {
            this.setPassandoPrograma(false);

        } else {
            System.out.println("Não consegui pausar");
        }

    }

}
