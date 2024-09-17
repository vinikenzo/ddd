//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var produto1 = new Produto(
                "Coca-Cola", 5, "Refrigerante de Cola", 10);
        var produto2 = new Produto(
                "Guarana", 5, "refrigerante de guarana", 4);
        var produto3 = new Produto("Fanta kiw", 0, null, 0);

        produto3.setNome("Fanta Kiwi");
        produto3.setDescricao("Refrigerante de kiwi");

        var produto4 = new Produto();
        produto4.setNome("sprite");
        produto4.AdicionarEstoque(10);

        produto1.RemoverEstoque(-5);
        System.out.println(produto1);
        System.out.println(produto3.getNome());


        var produtoFisico1 = new ProdutoFisico();
        produtoFisico1.setNome("Elden Ring - Mídia fisica - ps4");
        produtoFisico1.setPreco(200.0);
        produtoFisico1.setDescricao("Midia fisica do jogo Elden Ring para PS4");

        produtoFisico1.setDimensao(new Dimensao(20, 20, 20));
        produtoFisico1.getCaracteristicas().add(
                new Caracteristica("plataforma", "PS4"));
        produtoFisico1.getCaracteristicas().add(
                new Caracteristica("Distribuidora", "From software"));
        System.out.println(produtoFisico1);
    }
}


