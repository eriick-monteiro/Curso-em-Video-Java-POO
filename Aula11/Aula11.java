//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Aula11 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        Tecnico t1 = new Tecnico();
        Professor p1 = new Professor();

        t1.setNome("Erick");
        t1.setIdade(21);
        t1.setCurso("Engenharia da Computação");
        t1.setSexo("M");
        t1.setMatricula(1111);

        System.out.println(t1.getNome() + " tem " + t1.getIdade() + " anos de idade.");
        t1.fazerAniversario();
        t1.praticar();
        System.out.println(t1.getNome() + " está cursando " + t1.getCurso());
        t1.pagarMensalidade();

        b1.setNome("Guilherme");
        b1.setIdade(19);
        b1.setCurso("Design Digital");
        b1.setSexo("M");
        b1.setMatricula(2222);

        System.out.println(b1.getNome() + " tem " + b1.getIdade() + " anos de idade.");
        b1.fazerAniversario();
        b1.pagarMensalidade();

        v1.setNome("Roberta");
        v1.setIdade(24);
        v1.setSexo("F");

        v1.fazerAniversario();
    }
}