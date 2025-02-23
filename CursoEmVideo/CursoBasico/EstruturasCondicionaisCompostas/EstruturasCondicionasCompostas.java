import java.util.Scanner;

public class EstruturasCondicionasCompostas {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Informe o ano de seu nascimento: ");
    int nasc = teclado.nextInt();
    int idade = 2025 - nasc;
    if (idade >= 18) {
      System.out.format("Voce tem %d anos e voce e maior de idade\n", idade);
    } else {
      System.out.format("Voce tem %d anos e voce e menor de idade\n", idade);
    }
  }
}
