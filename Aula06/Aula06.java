public class Aula06 {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();

        controle.abrirMennu();
        controle.ligar();
        controle.abrirMennu();
        controle.fecharMenu();
        controle.maisVolume();
        controle.maisVolume();
        controle.menosVolume();
        controle.pause();
        controle.abrirMennu();
        controle.fecharMenu();
        controle.desligarMudo();
        controle.ligarMudo();
        controle.abrirMennu();
        controle.desligarMudo();

        for (int i = 0; i < 47; i++) {
            controle.menosVolume();
        }

        controle.abrirMennu();
        controle.desligar();
        
        controle.abrirMennu();
    }
}
