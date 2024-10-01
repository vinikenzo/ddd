import java.util.Objects;

public class Cardapio {

    private String nome;
    private String descricao;
    private double preco;

    public Cardapio() {
    }

    public Cardapio(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void Exibir_informacoes(){
        System.out.println("descrição do produto:" + descricao);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cardapio cardapio = (Cardapio) o;
        return Double.compare(preco, cardapio.preco) == 0 && Objects.equals(nome, cardapio.nome) && Objects.equals(descricao, cardapio.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, preco);
    }

    @Override
    public String toString() {
        return "Cardapio{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
