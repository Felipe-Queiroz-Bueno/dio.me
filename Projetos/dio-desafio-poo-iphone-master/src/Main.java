// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone 33 Pro Max Turbo", "Grafite", 15000.00);

        iphone.ligar();
        iphone.getCelular().ligar("1234-5678");
        iphone.getMusicPlayer().tocarMusica("NUMB - LINKIN PARK");
        iphone.getNavegadorDeInternet().exibirPagina("HTTPS://www.web.dio.me");
    }
}