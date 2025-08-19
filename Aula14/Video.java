public class Video implements AcoesVideo {
    private String titulo;
    private String avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    @Override
    public void play() {
        if (this.getReproduzindo()) {
            System.out.println("O vídeo não está pausado para dar play");
        }
        else {
            this.setReproduzindo(true);
            System.out.println("Play!");
        }
    }

    @Override
    public void pause() {
        if (!this.getReproduzindo()) {
            this.setReproduzindo(false);
            System.out.println("Pausado");
        }
        else {
            System.out.println("Vídeo já pausado");
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}
