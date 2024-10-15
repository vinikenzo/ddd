import java.util.ArrayList;
import java.util.Objects;

public class Servidor {
    private String nome;
    private ArrayList<Usuario>usuarios = new ArrayList<>();

    public Servidor() {
    }

    public Servidor(String nome, ArrayList<Usuario> usuarios) {
        this.nome = nome;
        this.usuarios = usuarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        return Objects.equals(nome, servidor.nome) && Objects.equals(usuarios, servidor.usuarios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, usuarios);
    }

    @Override
    public String toString() {
        return "Servidor{" +
                "nome='" + nome + '\'' +
                ", usuarios=" + usuarios +
                '}';
    }


}
