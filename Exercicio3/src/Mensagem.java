import java.util.Objects;

public class Mensagem {
    private String conteudo;
    private Usuario usuario;
    private Integer ano;
    private Integer mes;
    private Integer dia;
    private Integer hora;
    private Integer minuto;

    public void exibirMensagem(){
        System.out.println(this.usuario + ":" + this.conteudo + "(" + this.ano + "/" + this.mes + "/" + this.dia + "  " + this.hora + ":" + this.minuto + ")");
    }

    public Mensagem() {
    }

    public Mensagem(String conteudo, Usuario usuario, Integer ano, Integer mes, Integer dia, Integer hora, Integer minuto) {
        this.conteudo = conteudo;
        this.usuario = usuario;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getMinuto() {
        return minuto;
    }

    public void setMinuto(Integer minuto) {
        this.minuto = minuto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mensagem mensagem = (Mensagem) o;
        return Objects.equals(getConteudo(), mensagem.getConteudo()) && Objects.equals(getUsuario(), mensagem.getUsuario()) && Objects.equals(getAno(), mensagem.getAno()) && Objects.equals(getMes(), mensagem.getMes()) && Objects.equals(getDia(), mensagem.getDia()) && Objects.equals(getHora(), mensagem.getHora()) && Objects.equals(getMinuto(), mensagem.getMinuto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getConteudo(), getUsuario(), getAno(), getMes(), getDia(), getHora(), getMinuto());
    }

    @Override
    public String toString() {
        return "Mensagem{" +
                "conteudo='" + conteudo + '\'' +
                ", usuario=" + usuario +
                ", ano=" + ano +
                ", mes=" + mes +
                ", dia=" + dia +
                ", hora=" + hora +
                ", minuto=" + minuto +
                '}';
    }
}
