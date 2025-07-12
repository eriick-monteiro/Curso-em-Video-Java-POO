//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaBanco {
    // Atributos
    public int numeroConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Metodo Construtor
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    // Metodos Personalizados
    public void info() {
        System.out.println("----------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("----------------");
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);

        if ("CC".equals(tipo)) {
            this.setSaldo(this.getSaldo() + 50);
        }
        else if (tipo == "CP"){
            this.setSaldo(this.getSaldo() + 150);
        }
        System.out.println("Conta criada com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Impossível fechar conta enquanto houver saldo!");
        }
        else if (this.getSaldo() < 0) {
            System.out.println("Impossível fechar conta pois há débito!");
        }
        else {
            this.setStatus(false);
            System.out.println("Conta de " + this.getDono() + " encerrada com sucesso!");
        }
    }

    public void depositar(float valor) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.printf("Depósito de R$ %.2f realizado na conta de %s\n", valor, this.dono);
        }
        else {
            System.out.println("Impossível depositar em uma conta não ativa.");
        }
    }

    public void sacar(float valor) {
        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.printf("Saque de R$ %.2f realizado na conta de %s\n", valor, this.dono);
            }
            else {
                System.out.printf("Tentativa de saque de R$ %.2f.\n", valor);
                System.out.println("Impossível sacar valor maior do que há na conta!");
            }
        }
        else {
            System.out.println("Impossível sacar em uma conta não ativa.");
        }
    }

    public void pagarMensalidade() {
        int mensalidade = 0;

        if (this.getTipo() == "CC") {
            mensalidade = 12;
        } else if ("CP".equals(this.getTipo())) {
            mensalidade = 20;
        }

        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - mensalidade);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }
        else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }

    // Metodos Especiais
    public void setNumConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumConta() {
        return this.numeroConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}