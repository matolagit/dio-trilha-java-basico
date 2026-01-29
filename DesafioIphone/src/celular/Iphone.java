package celular;

import celular.apps.AparelhoTelefonico;
import celular.apps.NavegadorInternet;
import celular.apps.ReprodutorMusical;

import java.util.Scanner;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Reproduzindo música selecionada: "+musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o número: "+numero);
    }

    public void atender() {
        System.out.println("Chamada atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Eviando mensagem de voz");
    }

    public void exibirPagina(String url) {
        System.out.println(url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
