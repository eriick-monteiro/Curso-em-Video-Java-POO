public class Aula05 {
    public static void main(String[] args) {
        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setNumConta(1111);
        pessoa1.setDono("Jubileu");
        pessoa1.abrirConta("CC");
        pessoa1.info();

        ContaBanco pessoa2 = new ContaBanco();
        pessoa2.setNumConta(2222);
        pessoa2.setDono("Creusa");
        pessoa2.abrirConta("CP");
        pessoa2.info();

        pessoa1.depositar(300);
        pessoa2.depositar(500);

        pessoa1.info();
        pessoa2.info();

        pessoa2.sacar(1000);
        pessoa2.fecharConta();
        pessoa2.sacar(650);
        pessoa2.fecharConta();
        pessoa2.sacar(100);
        pessoa2.depositar(100);

        pessoa1.info();
        pessoa2.info();
    }
}
