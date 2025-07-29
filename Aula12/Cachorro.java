public class Cachorro extends Mamifero {
    private String nome;

    public void abanarRabo() {
        System.out.println(this.nome + " está abanando o rabo");
    }

    public void enterrarOsso() {
        System.out.println(this.nome + " está enterrando osso");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.nome + " está latindo");
    }

    @Override
    public void alimentar() {
        System.out.println(this.nome + " está comendo ração");
    }

    @Override
    public void locomover() {
        System.out.println(this.nome + " está correndo");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
