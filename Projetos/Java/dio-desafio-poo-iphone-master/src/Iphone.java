public class Iphone {
    private String modelo;
    private String cor;
    private double preco;
    private boolean ligado;

    private MusicPlayer musicPlayer;
    private Celular celular;
    private NavegadorDeInternet navegadorDeInternet;

    public Iphone(String modelo, String cor, double preco) {
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.ligado = false;

        this.musicPlayer = new MusicPlayer();
        this.celular = new Celular();
        this.navegadorDeInternet = new NavegadorDeInternet();
    }

    void ligar() {
        System.out.println("Iniciando IOS...");
    }

    public Celular getCelular() {
        return celular;
    }

    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    public NavegadorDeInternet getNavegadorDeInternet() {
        return navegadorDeInternet;
    }
}
