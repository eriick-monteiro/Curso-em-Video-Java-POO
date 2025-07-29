package RPG;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    private int vencedor;

    // Metodos
    public void lutar() {
        vencedor = 0;

        if (this.aprovada) {
            System.out.println("Desafiante");
            this.desafiante.apresentar();
            System.out.println();
            System.out.println("Desafiado");
            this.desafiado.apresentar();

            // Ele joga um dado de 6 lados para cada
            // ponto de força que eu tenho e soma.

            while (true) {
                int soco = 0;

                // Desafiado começa com o primeiro golpe
                System.out.println("\n" + this.desafiante.getNome() + " tenta socar " + this.desafiado.getNome());
                if (this.desafiado.getAcordado()) {
                    // Definindo a força do soco do Desafiado
                    for (int i = 0; i < desafiado.getForca(); i++) {
                        soco += (int)(Math.random()*6);
                    }
                    desafiado.setSoco(soco);

                    // Socando o Desafiante
                    System.out.println("\n" + this.desafiado.getNome() + " tenta socar " + this.desafiante.getNome());
                    if (this.desafiante.tentarDesviar()) {
                        System.out.println(this.desafiante.getNome() + " desviou do soco!");
                    }
                    else {
                        this.desafiado.socar(this.desafiante);
                    }
                }
                else {
                    this.vencedor = 1;
                    break;
                }

                // Desafiante revida e por aí vai até um dos dois cair
                if (this.desafiante.getAcordado()) {
                    // Definindo a força do soco do Desafiante
                    for (int i = 0; i < desafiante.getForca(); i++) {
                        soco += (int)(Math.random()*6);
                    }
                    desafiante.setSoco(soco);

                     //Socando o Desafiado
                     if (this.desafiado.tentarDesviar()) {
                        System.out.println(this.desafiado.getNome() + " desviou do soco!");
                     }
                     else {
                         this.desafiante.socar(this.desafiado);
                     }
                }
                else {
                    this.vencedor = 0;
                    break;
                }
            }

            switch (this.vencedor) {
                case 0: // Ganhou Desafiado
                    System.out.println("Vencedor: " + this.desafiado.getNome());
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    break;
                case 1: // ganhou Desafiante
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
