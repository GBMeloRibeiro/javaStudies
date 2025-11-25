import java.util.Scanner;

public class IO {

  public static int lerSegundos() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o tempo em segundos: ");
    return sc.nextInt();
  }

  public static void imprimirResultado(int h, int m, int s) {
    System.out.println("Horas: " + h);
    System.out.println("Minutos: " + m);
    System.out.println("Segundos: " + s);
  }
}
