import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int a = teclado.nextInt();
    int b = teclado.nextInt();

    System.out.println("SOMA = " + (a + b));
    System.out.println("Subtracao = " + (a - b));
    System.out.println("Multiplicacao = " + (a * b));
    float divisao = (float)a / b;
    if (b != 0) {
      System.out.println("Divisao = " + divisao);
    } else {
      System.out.println("Divisao = Impossivel dividir por zero");
    }
  }
}
