import java.util.Objects;

public class ProdutoFisico extends Produto{
    private double peso;
    private Dimensao dimensao;

    public ProdutoFisico() {
    }

    public ProdutoFisico(String nome, double preco, String descricao, int quantidade, double peso, Dimensao dimensao) {
        super(nome, preco, descricao, quantidade);
        this.peso = peso;
        this.dimensao = dimensao;
    }
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Dimensao getDimensao() {
        return dimensao;
    }

    public void setDimensao(Dimensao dimensao) {
        this.dimensao = dimensao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProdutoFisico that = (ProdutoFisico) o;
        return Double.compare(peso, that.peso) == 0 && Objects.equals(dimensao, that.dimensao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), peso, dimensao);
    }

    @Override
    public String toString() {
        return "ProdutoFisico{" +
                "peso=" + peso +
                ", dimensao=" + dimensao +
                "} " + super.toString();
    }
}


