public class Aula13 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        cachorro.setIdade(6);
        cachorro.setPeso(5f);
        cachorro.emitirSom();
        cachorro.reagir("Elogiar");
        cachorro.reagir(12, 59);
        cachorro.reagir(true);
        cachorro.reagir(cachorro.getIdade(), cachorro.getPeso());
        cachorro.reagir("Repreender");
    }
}