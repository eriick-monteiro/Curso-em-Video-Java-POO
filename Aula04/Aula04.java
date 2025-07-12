public class Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Azul", 0.5f);
        Caneta c2 = new Caneta("BIC", "Vermelha", 0.7f);

        c1.setModelo("BIC Cristal");
        c1.setPonta(0.7f);

        c1.status();
        System.out.println("-------------");
        c2.status();
    }
}


