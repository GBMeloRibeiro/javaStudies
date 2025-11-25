import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a nota 1: ");
    double n1 = sc.nextDouble();

    System.out.print("Digite a nota 2: ");
    double n2 = sc.nextDouble();

    System.out.print("Digite a nota 3: ");
    double n3 = sc.nextDouble();

    Student aluno = new Student(n1, n2, n3);

    double media = aluno.calcularMedia();
    String status = StatusCalculator.verificarStatus(media);

    System.out.println("\nMédia: " + media);
    System.out.println("Status do aluno: " + status);

    sc.close();
  }
}
