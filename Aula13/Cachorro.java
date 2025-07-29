public class Cachorro extends Mamifero {
    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }

    public void reagir(String frase) {
        if (frase == "Repreender") {
            System.out.println("Encolheu as orelhas e abaixou a cabeça");
        }
        else if (frase == "Elogiar") {
            System.out.println("Latiu e abanou o rabo");
        }
    }

    public void reagir(int hora, int minuto) {
        if (hora <= 12) {
            System.out.println("Abanou o rabo");
        }
        else if (hora >= 18) {
            System.out.println("Ignorou");
        }
        else {
            System.out.println("Latiu e abanou o rabo");
        }
    }

    public void reagir(boolean dono) {
        if (dono == true) {
            System.out.println("Latiu e abanou o rabo");
        }
        else {
            System.out.println("Rosnou");
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanou o rabo");
            }
            else {
                System.out.println("Latiu");
            }
        }
        else {
            if (peso < 10) {
                System.out.println("Rosnou");
            }
            else {
                System.out.println("Ignorou");
            }
        }
    }
}
