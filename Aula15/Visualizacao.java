public class Visualizacao {
    private Gafanhoto espectador;
    private Video video;
    
    public Visualizacao(Gafanhoto espectador, Video video) {
        this.espectador = espectador;
        this.video = video;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.video.setViews(this.video.getViews() + 1);
    }

    public void avaliar() {
        this.video.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.video.setAvaliacao(nota);
    }

    public void avaliar(float nota) {
        int total = 0;

        if (nota <= 20) {
            total = 3;
        }
        else if (nota <= 50) {
            total = 5;
        }
        else if (nota <= 90) {
            total = 8;
        }
        else {
            total = 10;
        }

        this.video.setAvaliacao(total);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", video=" + video +
                '}';
    }
}
