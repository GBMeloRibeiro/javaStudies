import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n, i, k, p;

    System.out.print("Digite o valor de n: ");
    n = scanner.nextInt();

    int[] v = new int[n];

    for (i = 0; i < n; i++) {
      System.out.print("Digite o valor da posição " + i + ": ");
      v[i] = scanner.nextInt();
    }

    System.out.print("Digite o número k: ");
    k = scanner.nextInt();

    System.out.print("Digite a posição p: ");
    p = scanner.nextInt();

    if (p < 0 || p >= n) {
      System.out.println("Posição inválida");
      return;
    }

    for (i = n - 1; i > p; i--) {
      v[i] = v[i - 1];
    }

    v[p] = k;

    System.out.println("Vetor resultante:");
    for (i = 0; i < n; i++) {
      System.out.println(v[i]);
    }
  }
}
