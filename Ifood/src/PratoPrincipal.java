import java.util.Objects;

public class PratoPrincipal extends Cardapio{

    private int tempo;

    public PratoPrincipal() {
    }

    public PratoPrincipal(String nome, String descricao, double preco, int tempo) {
        super(nome, descricao, preco);
        this.tempo = tempo;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public void calcularTempo(){
        System.out.println("O tempo de preparação do seu prato é de " + this.tempo);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PratoPrincipal that = (PratoPrincipal) o;
        return tempo == that.tempo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tempo);
    }

    @Override
    public String toString() {
        return "PratosPrincipais{" +
                "tempo=" + tempo +
                "} " + super.toString();
    }
}
