import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n, a, b;

    System.out.print("Digite o número n: ");
    n = scanner.nextInt();
    System.out.print("Digite o primeiro valor do intervalo: ");
    a = scanner.nextInt();
    System.out.print("Digite o segundo valor do intervalo: ");
    b = scanner.nextInt();

    int menor = Math.min(a, b);
    int maior = Math.max(a, b);

    if (n < menor) {
      System.out.println("O número está ANTES do intervalo.");
    } else if (n > maior) {
      System.out.println("O número está DEPOIS do intervalo.");
    } else {
      System.out.println("O número está DENTRO do intervalo.");
    }
  }
}
