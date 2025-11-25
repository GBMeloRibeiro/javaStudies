import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nome do produto: ");
    String nome = scanner.nextLine();
    System.out.println("Preço do produto: ");
    double preco = scanner.nextDouble();
    System.out.println("Quantidade comprada: ");
    int quantidade = scanner.nextInt();
    double valorTotal = preco * quantidade;
    double desconto = 0;
    if (quantidade >= 11 && quantidade <= 20) {
      desconto = 0.10;
    } else if (quantidade >= 21 && quantidade <= 50) {
      desconto = 0.20;
    } else if (quantidade > 50) {
      desconto = 0.25;
    }
    double valorComDesconto = valorTotal - (valorTotal * desconto);
    System.out.println("Produto: " + nome);
    System.out.println("Valor total a pagar: R$ " + valorComDesconto);
  }
}
