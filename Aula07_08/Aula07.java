//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Aula07 {
    public static void main(String[] args) {
        /*
        Lutador prettyboy = new Lutador("PrettyBoy", "França", 31, 1.75f,68.9f,11, 2, 1);
        Lutador putscript = new Lutador("PutScript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        Lutador snapshadow = new Lutador("SnapShadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        Lutador deadcode = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.3f, 13, 0, 2);
        Lutador ufocobol = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        Lutador nerdaard = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

        prettyboy.apresentar();
        putscript.apresentar();
        snapshadow.apresentar();
        deadcode.apresentar();
        ufocobol.apresentar();
        nerdaard.apresentar();
        */

        Lutador lutadores[] = new Lutador[6];

        lutadores[0] = new Lutador("PrettyBoy", "França", 31, 1.75f,68.9f,11, 2, 1);
        lutadores[1] = new Lutador("PutScript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        lutadores[2] = new Lutador("SnapShadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        lutadores[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.3f, 13, 0, 2);
        lutadores[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        lutadores[5] = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

        for (int i = 0; i < lutadores.length; i++) {
            lutadores[i].status();
        }

        Luta UEC01 = new Luta(lutadores[2], lutadores[3], 2);
        UEC01.lutar();
    }
}