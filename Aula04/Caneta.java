public class Caneta {
    private String modelo;
    private float ponta;
    private boolean isTampada;
    private String cor;

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampar();
    }

    public void tampar() {
        if (!this.isTampada) {
            this.isTampada = true;
        }
        else {
            System.out.println("Caneta já está tampada");
        }
    }

    public void destampar() {
        if (this.isTampada) {
            this.isTampada = false;
        }
        else {
            System.out.println("Caneta já está destampada");
        }
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Float getPonta() {
        return this.ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void status() {
        System.out.println("Sobre a Caneta");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.getPonta() + "mm");
        System.out.println("Tamapda: " + this.isTampada);
    }
}
