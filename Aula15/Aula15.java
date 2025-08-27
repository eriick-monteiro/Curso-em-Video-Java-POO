public class Aula15 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]); // Jubileu assiste HTML5
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]); // Jubileu assiste PHP
        vis[1].avaliar(73.0f);
        System.out.println(vis[1].toString());

        vis[2] = new Visualizacao(g[0], v[0]); // Jubileu assiste POO
        vis[2].avaliar(6);
        System.out.println(vis[2].toString());

        vis[3] = new Visualizacao(g[1], v[2]); // Creuza assiste HTML5
        vis[3].avaliar(10);
        System.out.println(vis[3].toString());

        vis[4] = new Visualizacao(g[1], v[0]); // Creuza assiste POO
        vis[4].avaliar(42.0f);
        System.out.println(vis[4].toString());

        System.out.println("VIDEOS\n------------------------------");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i].toString());
        }

        System.out.println("\nGAFANHOTOS\n------------------------------");
        for (int i = 0; i < g.length; i++) {
            System.out.println(g[i].toString());
        }
    }
}