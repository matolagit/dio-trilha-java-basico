import celular.Iphone;

public class TesteCelular {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("a map, a strin, a light");

        iphone.atender();
        iphone.ligar("(11)90924-4201");
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.google.com/");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
