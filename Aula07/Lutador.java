import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Metodo Construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
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
