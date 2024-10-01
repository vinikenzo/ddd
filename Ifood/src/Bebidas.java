import java.util.Objects;

    public class Bebidas  extends Cardapio {
        private String gelada;
        private String quente;

        public Bebidas() {
        }

        public Bebidas(String gelada, String quente) {
            this.gelada = gelada;
            this.quente = quente;
        }

        public String getGelada() {
            return gelada;
        }

        public void setGelada(String gelada) {
            this.gelada = gelada;
        }

        public String getQuente() {
            return quente;
        }

        public void setQuente(String quente) {
            this.quente = quente;
        }

        public void escolherTemperatura(String temperatura){
            if(temperatura == "gelada")
                System.out.println("Sua bebida é gelada");
            else
                System.out.println("Sua bebida é quente");

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Bebidas bebidas = (Bebidas) o;
            return Objects.equals(gelada, bebidas.gelada) && Objects.equals(quente, bebidas.quente);
        }

        @Override
        public int hashCode() {
            return Objects.hash(gelada, quente);
        }

        @Override
        public String toString() {
            return "Bebidas{" +
                    "gelada='" + gelada + '\'' +
                    ", quente='" + quente + '\'' +
                    '}';
        }

}
