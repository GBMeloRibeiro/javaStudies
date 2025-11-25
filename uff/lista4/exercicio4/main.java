import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] nomes = new String[10];
    int[] idades = new int[10];
    int i;

    for (i = 0; i < 10; i++) {
      System.out.print("Nome da pessoa " + (i + 1) + ": ");
      nomes[i] = scanner.nextLine();
      System.out.print("Idade da pessoa " + (i + 1) + ": ");
      idades[i] = scanner.nextInt();
      scanner.nextLine(); // limpar buffer
    }

    String[] nomesOrdenados = Arrays.copyOf(nomes, 10);
    Arrays.sort(nomesOrdenados);

    System.out.println("\nPessoas em ordem alfabética:");
    for (i = 0; i < 10; i++) {
      System.out.println(nomesOrdenados[i]);
    }

    System.out.println("\nPessoas em ordem crescente de idade:");
    for (int idadeAtual = 0; idadeAtual <= 150; idadeAtual++) {
      for (i = 0; i < 10; i++) {
        if (idades[i] == idadeAtual) {
          System.out.println(nomes[i] + " - " + idades[i] + " anos");
        }
      }
    }
  }
}
