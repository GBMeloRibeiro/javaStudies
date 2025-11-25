import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n, i, k;

    System.out.print("Digite o valor de n: ");
    n = scanner.nextInt();

    int[] v = new int[n];

    for (i = 0; i < n; i++) {
      System.out.print("Digite o valor da posição " + i + ": ");
      v[i] = scanner.nextInt();
    }

    System.out.print("Digite o número k: ");
    k = scanner.nextInt();

    boolean encontrado = false;

    for (i = 0; i < n; i++) {
      if (v[i] == k) {
        System.out.println("k encontrado na posição: " + i);
        encontrado = true;
      }
    }

    if (!encontrado) {
      System.out.println("Número não encontrado");
    }
  }
}
