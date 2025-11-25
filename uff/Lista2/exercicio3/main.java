import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Infomr um valor em segundos: ");
    int t = scanner.nextInt();
    int horas = t / 3600;
    if (horas > 0) {
      t = t - (horas * 3600);
    }
    int minutos = t / 60;
    if (minutos > 0) {
      t = t - (minutos * 60);
    }
    System.out.println(horas + " Horas " + minutos + " Minutos " + t +
                       " Segundos");
  }
}
