import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    float a = scanner.nextFloat();
    float b = scanner.nextFloat();
    System.out.println("Soma: " + (a + b));
    System.out.println("Subtração: " + (a - b));
    System.out.println("Multiplicação: " + (a * b));
    if (b != 0) {
      System.out.println("Divisão: " + (a / b));
    } else {
      System.out.println("Divisão: Não é possível dividir por zero.");
    }
  }
}
