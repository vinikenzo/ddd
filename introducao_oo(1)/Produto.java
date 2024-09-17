import java.util.ArrayList;
import java.util.Objects;

public class Produto {
    //Atributos
    private String nome;
    private double preco;
    private String descricao;
    private int quantidade;
    private ArrayList<Caracteristica>caracteristicas = new ArrayList<>();

    //Construtor vazio

    public Produto() {
    }
    //Construtor intermediario

    public Produto(String nome, int quantidade, String descricao, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.preco = preco;
    }

    //Construtor completo


    public Produto(String nome, double preco, String descricao, int quantidade, ArrayList<Caracteristica> caracteristicas) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.caracteristicas = caracteristicas;
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

    public ArrayList<Caracteristica> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(ArrayList<Caracteristica> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    //Metodos ou funçoes

    public void AdicionarEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public void RemoverEstoque(int quantidade){
        if(this.quantidade - quantidade < 0)
            System.out.println("Quantidade insuficiente em estoque");
        else
            this.quantidade -= quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(getPreco(), produto.getPreco()) == 0 && quantidade == produto.quantidade && Objects.equals(getNome(), produto.getNome()) && Objects.equals(getDescricao(), produto.getDescricao()) && Objects.equals(getCaracteristicas(), produto.getCaracteristicas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getPreco(), getDescricao(), quantidade, getCaracteristicas());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", caracteristicas=" + caracteristicas +
                '}';
    }
}
