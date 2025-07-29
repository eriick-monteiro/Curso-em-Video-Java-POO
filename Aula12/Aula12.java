//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Aula12 {
    public static void main(String[] args) {
        Mamifero humano = new Mamifero();
        Reptil cobra = new Reptil();
        Peixe peixeDourado = new Peixe();
        Ave calopsita = new Ave();
        Tartaruga tartaruga = new Tartaruga();
        Cachorro cachorro = new Cachorro();

        humano.setMembros(4);
        humano.setPeso(3.6f);
        humano.setIdade(1);
        humano.setCorPelo("Loiro");
        humano.locomover();
        humano.alimentar();
        humano.emitirSom();

        System.out.println();

        cobra.setIdade(3);
        cobra.setMembros(0);
        cobra.setPeso(0.600f);
        cobra.setCorEscama("Preto");
        cobra.locomover();
        cobra.alimentar();
        cobra.emitirSom();

        System.out.println();

        peixeDourado.setMembros(3);
        peixeDourado.setPeso(0.100f);
        peixeDourado.setIdade(1);
        peixeDourado.setCorEscama("Dourado");
        peixeDourado.locomover();
        peixeDourado.alimentar();
        peixeDourado.emitirSom();
        peixeDourado.soltarBolhas();

        System.out.println();

        calopsita.setMembros(4);
        calopsita.setPeso(.200f);
        calopsita.setIdade(5);
        calopsita.setCorPena("Cinza");
        calopsita.locomover();
        calopsita.alimentar();
        calopsita.emitirSom();
        calopsita.fazerNInho();

        System.out.println();

        tartaruga.setIdade(36);
        tartaruga.setMembros(5);
        tartaruga.setPeso(0.750f);
        tartaruga.setCorEscama("Verde");
        tartaruga.locomover();
        tartaruga.alimentar();
        tartaruga.emitirSom();

        System.out.println();

        cachorro.setNome("Fred");
        cachorro.setMembros(5);
        cachorro.setPeso(5.8f);
        cachorro.setIdade(13);
        cachorro.setCorPelo("Caramelo");
        cachorro.locomover();
        cachorro.alimentar();
        cachorro.emitirSom();
        cachorro.enterrarOsso();
        cachorro.abanarRabo();
    }
}