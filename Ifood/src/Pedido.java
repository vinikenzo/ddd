
import java.util.ArrayList;
import java.util.Objects;

public class Pedido extends Cardapio {

    private String preparacao;
    private String entrega;
    private String entregue;
    private ArrayList<Cardapio> itens = new ArrayList<>();


    public Pedido() {
    }

    public Pedido(String nome, String descricao, double preco, String preparacao, String entrega, String entregue, ArrayList<Cardapio> cardapios) {
        super(nome, descricao, preco);
        this.preparacao = preparacao;
        this.entrega = entrega;
        this.entregue = entregue;
        this.itens = cardapios;
    }

    public String getPreparacao() {
        return preparacao;
    }

    public void setPreparacao(String preparacao) {
        this.preparacao = preparacao;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public String getEntregue() {
        return entregue;
    }

    public void setEntregue(String entregue) {
        this.entregue = entregue;
    }

    public ArrayList<Cardapio> getCardapios() {
        return itens;
    }

    public void setCardapios(ArrayList<Cardapio> cardapios) {
        this.itens = cardapios;
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(preparacao, pedido.preparacao) && Objects.equals(entrega, pedido.entrega) && Objects.equals(entregue, pedido.entregue) && Objects.equals(itens, pedido.itens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), preparacao, entrega, entregue, itens);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "preparacao='" + preparacao + '\'' +
                ", entrega='" + entrega + '\'' +
                ", entregue='" + entregue + '\'' +
                ", cardapios=" + itens +
                "} " + super.toString();
    }
}

