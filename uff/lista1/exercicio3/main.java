public class main {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("informe um numero: ");
    int n = scanner.nextInt();
    if (n % 2 == 0) {
      System.out.println("O numero " + n + " é par");
    } else {
      System.out.println("O numero " + n + " é impar");
    }
    scanner.close();
  }
}
