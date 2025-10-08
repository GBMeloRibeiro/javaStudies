public class main {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("Informe uma temperatura em Celsius: ");
    Double C = scanner.nextDouble();
    Double V = 1.8;
    Double F = (C * V) + 32;
    System.out.println(C + " Celsius equivale a " + F + " Fahrenheit");
    scanner.close();
  }
}
