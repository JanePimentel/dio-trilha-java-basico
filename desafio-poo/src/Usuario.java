public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionar("Here Comes The Sun - The Beatles");
        iphone.tocar();
        iphone.pausar();
        

        iphone.ligar("87 9 9999-0000");
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        iphone.exibirPagina("https://staruml.io/");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}