package Iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefônico, NavegadorInternet{
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música" + musica);
    }
    public void tocar() {
        System.out.println("Tocando Aúdio.");
    }
    public void pausar() {
        System.out.println("Pausando Aúdio.");
    }
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }
    public void atender() {
        System.out.println("Chamada atendida.");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Adcionando nova aba");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
