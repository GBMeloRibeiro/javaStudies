import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int codigo;

    do {
      System.out.print("Informe o código: ");
      codigo = teclado.nextInt();

      if (codigo != -1) {
        System.out.println("Código: " + codigo);
      }

    } while (codigo != -1);
  }
}
