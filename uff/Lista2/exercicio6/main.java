import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("informe o nome do produto: ");
    String nomeProduto = scanner.nextLine();
    System.out.println("informe o preço do produto: ");
    double precoProduto = scanner.nextDouble();
    System.out.println("informe a quantidade do produto: ");
    int quantidadeProduto = scanner.nextInt();
    if (quantidadeProduto < 0) {
      System.out.println(
          "Quantidade inválida. A quantidade não pode ser negativa.");
    } else if (precoProduto < 0) {
      System.out.println("Preço inválido. O preço não pode ser negativo.");
    } else if (quantidadeProduto <= 10) {
      double valorTotal = precoProduto * quantidadeProduto;
    } else if (quantidadeProduto > 10 && quantidadeProduto < 21) {
      double valorTotal = (precoProduto * quantidadeProduto) * 0.9;
    } else if (quantidadeProduto >= 21 && quantidadeProduto < 51) {
      double valorTotal = (precoProduto * quantidadeProduto) * 0.8;
    } else {
      double valorTotal = (precoProduto * quantidadeProduto) * 0.75;
    }
  }
