//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var produto1 = new Produto(
                "Coca-Cola", 5.0, "Refrigerante de Cola",10);
        var produto2 = new Produto("Guarana", 5.0,"refrigerante de guarana", 4);
        var produto3 = new Produto("Fanta kiw", 0, null, 0);

        produto3.setNome("Fanta Kiwi");
        produto3.setDescricao("Refrigerante de kiwi");
        var produto4 = new Produto();
        produto4.setNome("sprite");
        produto4.AdicionarEstoque(10);

        produto1.AdicionarEstoque(5);
        System.out.println(produto1);
        System.out.println(produto3.getNome());

        var numero = 10;
        if(numero == 10)
            System.out.println("Numero é igual a 10");

        var texto = "teste";
        if(texto.equals("teste"))
            System.out.println("Texto é igual a teste");

        var produto5 = new Produto();
        if(produto5.equals(produto4))
            System.out.println("Os produtos são iguais");

        var produtoFisico1 = new ProdutoFisico();
        produtoFisico1.setNome("Elden Ring - Mídia fisica - ps4");
        produtoFisico1.setPreco(200.0);
        produtoFisico1.setDescricao(
                "Midia fisica do jogo Elden Ring para PS4");

    }
}


