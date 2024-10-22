import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    var usuario1 = new Usuario("Estevão", "1234");
    var usuario2 = new Usuario("Rony", "5678");
    var usuario3 = new Usuario("Deyverson", "9101");

    var mensagem1 = new Mensagem("Olá pessoal", usuario1, 2024, 10, 15, 16, 50);
    var mensagem2 = new Mensagem("Olá Estevão", usuario2, 2024, 10, 15, 16, 51);
    var mensagem3 = new Mensagem("O código de vocês funcionou?", usuario1, 2024, 10, 15, 18, 40);
    var mensagem4 = new Mensagem("O meu não", usuario2, 2024, 10, 15, 20,12);
    var mensagem5 = new Mensagem("O meu também não", usuario3, 2024, 10, 16, 23, 30);

    var servidor1 = new Servidor();

    servidor1.setNome("Devs");
    servidor1.adicionarUsuario(usuario1);
    servidor1.adicionarUsuario(usuario2);
    servidor1.adicionarUsuario(usuario3);
    servidor1.adicionarMensagem(mensagem1);
    servidor1.adicionarMensagem(mensagem2);
    servidor1.adicionarMensagem(mensagem3);
    servidor1.adicionarMensagem(mensagem4);
    servidor1.adicionarMensagem(mensagem5);
    servidor1.exibirHistorico();

    var mensagenFiltradaPorUsuario = servidor1.getMensagensPorUsuario(usuario1);
        System.out.println(mensagenFiltradaPorUsuario);

    var mensagemFiltradaPorConteudo = servidor1.getMensagemPorConteudo("Olá pessoal");
        System.out.println(mensagemFiltradaPorConteudo);

    var mensagemFiltradaPorPalavra = servidor1.getMensagemPorPalavra("meu");
        System.out.println(mensagemFiltradaPorPalavra);

    var numeroDeMensagens = servidor1.getNumeroDeMensagens();
        System.out.println(numeroDeMensagens);

    var numeroDeMensagensPorUsuario = servidor1.getNumeroDeMensagensPorUsuario(usuario3);
        System.out.println(numeroDeMensagensPorUsuario);



    }
}