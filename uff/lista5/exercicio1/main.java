import java.util.ArrayList;

public class Main {
  static class Produto {
    String nome;
    double preco;
    int estoque;

    Produto(String nome, double preco, int estoque) {
      this.nome = nome;
      this.preco = preco;
      this.estoque = estoque;
    }
  }

  static class ItemPedido {
    Produto produto;
    int quantidade;

    ItemPedido(Produto produto, int quantidade) {
      this.produto = produto;
      this.quantidade = quantidade;
    }

    double total() { return quantidade * produto.preco; }
  }

  static class Pedido {
    ArrayList<ItemPedido> itens = new ArrayList<>();
    String formaPagamento;

    void adicionar(ItemPedido item) { itens.add(item); }

    void pagar(String forma) { formaPagamento = forma; }

    double total() {
      double t = 0;
      for (ItemPedido i : itens)
        t += i.total();
      return t;
    }
  }

  public static void main(String[] args) {
    Produto p1 = new Produto("Arroz", 18.0, 40);
    Produto p2 = new Produto("Feijão", 9.0, 25);
    Produto p3 = new Produto("Leite", 5.5, 60);

    Pedido pedido = new Pedido();
    pedido.adicionar(new ItemPedido(p1, 3));
    pedido.adicionar(new ItemPedido(p2, 2));
    pedido.adicionar(new ItemPedido(p3, 4));
    pedido.pagar("Dinheiro");

    System.out.println("Pedido:");
    for (ItemPedido item : pedido.itens) {
      System.out.println(item.produto.nome + " x " + item.quantidade +
                         " = R$ " + item.total());
    }

    System.out.println("Total: R$ " + pedido.total());
    System.out.println("Pagamento: " + pedido.formaPagamento);
  }
}
