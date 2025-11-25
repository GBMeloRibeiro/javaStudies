import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n, i;
    double soma = 0;

    System.out.print("Digite o número de alunos: ");
    n = scanner.nextInt();

    double[] notas = new double[n];

    for (i = 0; i < n; i++) {
      System.out.print("Nota do aluno " + (i + 1) + ": ");
      notas[i] = scanner.nextDouble();
      soma += notas[i];
    }

    double media = soma / n;

    System.out.println("\nMédia da turma: " + media);
    System.out.println("Notas acima da média:");

    for (i = 0; i < n; i++) {
      if (notas[i] > media) {
        System.out.println(notas[i]);
      }
    }
  }
}
