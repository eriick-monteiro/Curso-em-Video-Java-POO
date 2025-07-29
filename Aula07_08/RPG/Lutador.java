package RPG;

public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private int forca;
    private int velocidade;
    private int soco;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int vida;
    private boolean acordado;

    // Metodo Construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int forca, int velocidade, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setForca(forca);
        this.velocidade = velocidade;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.vida = 100;
        this.acordado = true;
    }

    // Métodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        }
        else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        }
        else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        }
        else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        }
        else {
            this.categoria = "Inválido";
        }

    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getSoco() {
        return soco;
    }

    public void setSoco(int soco) {
        this.soco = soco;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean getAcordado() {
        return acordado;
    }

    public void setAcordado(boolean acordado) {
        this.acordado = acordado;
    }

    // Métodos
    public void ganharLuta() {
        this.setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setDerrotas(getEmpates() + 1);
    }

    public void checarVida() {
        if (this.getVida() <= 0) {
            this.setAcordado(false);
        }
    }

    public void socar(Lutador adversario) {
        adversario.setVida(adversario.getVida() - this.soco);

        System.out.println(this.getNome() + " soca " + adversario.getNome() + " tirando " + this.soco + " de dano! (" + adversario.getVida() + "/100)");

        adversario.checarVida();
    }

    public boolean tentarDesviar() {
        int valor = (int)(Math.random()*getVelocidade());
        boolean desvio = false;

        if (valor <= this.getVelocidade()) {
            desvio = true;
        }
        return desvio;
    }

    public void apresentar() {
        System.out.println("--------------------------------");
        System.out.println("Apresentando AGORA!");
        System.out.println("O Lutador " + this.getNome() + ".");
        System.out.println("Diretamente de " + this.getNacionalidade() + ".");
        System.out.println(this.getIdade() + " anos.");
        System.out.println(this.getAltura() + "m de altura.");
        System.out.println("Participando da Categoria Peso " + this.getCategoria());
        System.out.println("Pesando " + getPeso() + "Kg.");
        System.out.println("Venceu " + this.getVitorias() + " lutas.");
        System.out.println("Perdeu " + this.getDerrotas() + " lutas.");
        System.out.println("Empatou " + this.getEmpates() + " vezes.\n");
    }

    public void status() {
        System.out.println("-----------------");
        System.out.println(this.getNome());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println("Com " + this.getVitorias() + " Vitórias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates() + " Empates");
    }
}
