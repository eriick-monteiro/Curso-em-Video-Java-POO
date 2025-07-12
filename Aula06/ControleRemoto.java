//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ControleRemoto implements controlador {
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMennu() {
        if (this.getLigado()) {
            System.out.println("Ligado: " + this.getLigado());
            System.out.println("Volume: " + this.getVolume());

            // Imprimindo o volume em barrinhas
            for (int i=0; i<this.getVolume(); i++) {
                System.out.print("|");
            }
            System.out.println();

            System.out.println("Tocando: " + this.getTocando());
        }
        else {
            System.out.println("A televisão precisa estar ligada para essa operação");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && this.getTocando()) {
            System.out.println("Pausado");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && !this.getTocando()) {
            System.out.println("Despausado");
        }
    }

    // Metodos Especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
}