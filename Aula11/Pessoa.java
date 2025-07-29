public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public final void fazerAniversario() {
        this.idade ++;
        System.out.println("Feliz " + this.idade + " anos de idade " + this.nome + "!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

class Visitante extends Pessoa {

}

class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

class Tecnico extends Aluno {
    public String registroProfissional;

    public void praticar() {
        System.out.println("Praticando!");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}

class Bolsista extends Aluno {
    private int bolsa;

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
    }

    public void renovarBolsa() {
        System.out.println("Bolsa de " + this.getNome() + " Renovada!");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}

class Professor extends Pessoa {
    public String especialidade;
    public float salario;

    public void receberAumento(float valor) {
        this.setSalario(this.getSalario() + valor);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
