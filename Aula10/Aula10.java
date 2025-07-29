//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Aula10 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p1.setSexo("M");
        p1.setIdade(43);

        p2.setNome("Maria");
        p2.setSexo("F");
        p2.setIdade(21);
        p2.setCurso("Arquitetura");
        p2.setMatricula(1094);

        p3.setNome("Cláudio");
        p3.setSexo("M");
        p3.setIdade(68);
        p3.setEspecialidade("Tecnologia");
        p3.setSalario(2788.90F);

        p4.setNome("Fabiana");
        p4.setSexo("F");
        p4.setIdade(38);
        p4.setSetor("Administração");
        p4.setTrabalhando(true);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        System.out.println(p3.getSalario());

        p2.fazerAniversario();
        p4.fazerAniversario();

        p2.cancelarMatricula();
        p3.pedirAumento(500F);
        p4.mudarTrabalho();

        System.out.println(p3.getSalario());
        System.out.println(p4.getTrabalhando());

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}