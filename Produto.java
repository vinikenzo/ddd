import java.util.Objects;

public class Produto {
    //Atributos
    private String nome;
    private double preco;
    private String descricao;
    private int quantidade;

    //Construtor vazio

    public Produto() {
    }

    //Construtor completo
    public Produto(String nome, double preco, String descricao, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }
    //Getters e Setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
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
    //Metodos ou funçoes

    public void AdicionarEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(preco, produto.preco) == 0 && quantidade == produto.quantidade && Objects.equals(getNome(), produto.getNome()) && Objects.equals(getDescricao(), produto.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), preco, getDescricao(), quantidade);
    }

    public void RemoverEstoque(int quantidade){
        if(this.quantidade - quantidade < 0)
            this.quantidade = 0;
        else
            this.quantidade -= quantidade;
    }
}
