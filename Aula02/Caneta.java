public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void info() {
        System.out.println("Informações da Caneta");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Tampada: " + this.tampada);
    }

    public void rabiscar() {
        if (!this.tampada) {
            System.out.println("Rabiscando XD");
        }
        else {
            System.out.println("Opa! A Caneta precisa estar destampada para realizar essa operação!");
        }
    }

    private void tampar() {
        System.out.println("Tampando...");
        if (!this.tampada) {
            this.tampada = true;
        }
        else {
            System.out.println("Caneta já está tampada");
        }
        System.out.println("Tampada = " + this.tampada);
    }

    protected void destampar() {
        System.out.println("Destampando...");
        if (this.tampada) {
            this.tampada = false;
        }
        else {
            System.out.println("Caneta já está destampada");
        }
        System.out.println("Tampada = " + this.tampada);
    }
}
