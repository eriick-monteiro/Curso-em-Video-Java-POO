public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos
    public void lutar() {
        if (this.aprovada) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();

            int vencedor = (int)(Math.random()*3);

            switch (vencedor) {
                case 0: // Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // Ganhou Desafiado
                    System.out.println("Vencedor: " + this.desafiado.getNome());
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    break;
                case 2: // ganhou Desafiante
                    System.out.println("Vencedor: " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        }
        else {
            System.out.println("A luta não pode acontecer");
        }
    }

    // Metodo Construtor
    public Luta(Lutador desafiado, Lutador desafiante, int rounds) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.rounds = rounds;
        this.setAprovada();
        this.aprovada = getAprovada();
    }

    // Metodos Especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada() {
        if (this.desafiado == this.desafiante || this.desafiado.getCategoria() != this.desafiante.getCategoria()) {
            this.aprovada = false;
        }
        else if (this.desafiado.getCategoria() == this.desafiante.getCategoria()) {
            this.aprovada = true;
        }
    }
}
