import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int soma = 0;

    while (true) {
      try {
        System.out.print(
            "Digite um número inteiro positivo (<= 0 para parar): ");
        int num = Integer.parseInt(sc.nextLine());

        if (num <= 0) {
          break;
        }

        soma += num;

      } catch (NumberFormatException e) {
        System.out.println("Erro: você deve digitar um número inteiro válido!");
      }
    }

    System.out.println("Somatório dos números digitados: " + soma);
    sc.close();
  }
}
