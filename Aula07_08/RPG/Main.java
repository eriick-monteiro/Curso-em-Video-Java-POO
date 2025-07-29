package RPG;

public class Main {
    public static void main(String[] args) {
        Lutador lutadores[] = new Lutador[6];

        lutadores[0] = new Lutador("PrettyBoy", "França", 31, 1.75f,68.9f, 4, 6, 11, 2, 1);
        lutadores[1] = new Lutador("PutScript", "Brasil", 29, 1.68f, 57.8f, 2, 7, 14, 2, 3);
        lutadores[2] = new Lutador("SnapShadow", "EUA", 35, 1.65f, 80.9f, 3, 5, 12, 2, 1);
        lutadores[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.3f, 4, 5, 13, 0, 2);
        lutadores[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 3, 5, 4, 3);
        lutadores[5] = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 4, 4, 12, 2, 4);

        // for (int i = 0; i < lutadores.length; i++) {
        //     lutadores[i].status();
        // }

        Luta UEC01 = new Luta(lutadores[0], lutadores[1], 2);
        UEC01.lutar();
    }
}