import java.util.Scanner;

public class Main {

  public static double lerNumero(Scanner sc, String mensagem) {
    while (true) {
      try {
        System.out.print(mensagem);
        return Double.parseDouble(sc.nextLine());
      } catch (NumberFormatException e) {
        System.out.println("Entrada inválida! Digite um número válido.");
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Escolha a operação:");
    System.out.println("1 - Soma");
    System.out.println("2 - Divisão");
    System.out.println("3 - Raiz");

    int opcao = (int)lerNumero(sc, "Opção: ");

    OperacaoMatematica op = null;

    switch (opcao) {
    case 1:
      double a = lerNumero(sc, "Digite o primeiro número: ");
      double b = lerNumero(sc, "Digite o segundo número: ");
      op = new Soma(a, b);
      break;

    case 2:
      double x = lerNumero(sc, "Digite o dividendo: ");
      double y = lerNumero(sc, "Digite o divisor: ");
      op = new Divisao(x, y);
      break;

    case 3:
      double r = lerNumero(sc, "Digite o número para tirar a raiz: ");
      op = new Raiz(r);
      break;

    default:
      System.out.println("Opção inválida!");
      sc.close();
      return;
    }

    op.executar();
    sc.close();
  }
}
