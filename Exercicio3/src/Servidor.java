import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Servidor {
    private String nome;
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Mensagem> mensagens = new ArrayList<>();



    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario){
        usuarios.remove(usuario);
    }

    public void adicionarMensagem(Mensagem mensagem){
        mensagens.add(mensagem);
    }

    public void removerMensagem(Mensagem mensagem){
        mensagens.remove(mensagem);
    }


    public void exibirHistorico(){
        System.out.println("Exibindo histórico de conversas do servidor: " + this.nome);
        for (var mensagem:mensagens) {
            mensagem.exibirMensagem();
            System.out.println("----------------------");

        }
    }

    public List<Mensagem> getMensagensPorUsuario(Usuario usuario){
        return mensagens.stream()
                .filter(mensagem -> mensagem.getUsuario().equals(usuario))
                .toList();
    }

    public List<Mensagem> getMensagemPorConteudo(String conteudo){
        return mensagens.stream()
                .filter(mensagem -> mensagem.getConteudo().equals(conteudo))
                .toList();

    }

    public List<Mensagem> getMensagemPorPalavra(String palavra){
        return mensagens.stream()
                .filter(mensagem -> mensagem.getConteudo().contains(palavra))
                .toList();

    }

    public int getNumeroDeMensagens(){
        return mensagens.size();

    }

    public int getNumeroDeMensagensPorUsuario(Usuario usuario){
        return(int) mensagens.stream()
                .filter(mensagem -> mensagem.getUsuario().equals(usuario))
                .count();
    }

    public Servidor() {
    }

    public Servidor(String nome, ArrayList<Mensagem> mensagens, ArrayList<Usuario> usuarios) {
        this.nome = nome;
        this.mensagens = mensagens;
        this.usuarios = usuarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Mensagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(ArrayList<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servidor servidor = (Servidor) o;
        return Objects.equals(getNome(), servidor.getNome()) && Objects.equals(getUsuarios(), servidor.getUsuarios()) && Objects.equals(getMensagens(), servidor.getMensagens());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getUsuarios(), getMensagens());
    }

    @Override
    public String toString() {
        return "Servidor{" +
                "nome='" + nome + '\'' +
                ", usuarios=" + usuarios +
                ", mensagens=" + mensagens +
                '}';
    }
}
