public class main {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("Informe um valor em Centavos: ");
    int m1real = 0;
    int m50centavos = 0;
    int m25centavos = 0;
    int m10centavos = 0;
    int m5centavos = 0;
    int m1centavo = 0;
    int valor = scanner.nextInt();
    int valor2 = valor;
    while (valor != 0) {
      if (valor >= 100) {
        valor = valor - 100;
        m1real++;
        continue;
      }
      if (valor >= 50) {
        valor = valor - 50;
        m50centavos++;
        continue;
      }
      if (valor >= 25) {
        valor = valor - 25;
        m25centavos++;
        continue;
      }
      if (valor >= 10) {
        valor = valor - 10;
        m10centavos++;
        continue;
      }
      if (valor >= 5) {
        valor = valor - 5;
        m5centavos++;
        continue;
      }
      if (valor >= 1) {
        valor = valor - 1;
        m1centavo++;
        continue;
      }
    }
    System.out.println(
        "E possivel representar " + valor2 + " com moedas de: " + m1real +
        " de 1 real, " + m50centavos + " de 50 centavos, " + m25centavos +
        " de 25 centavos, " + m10centavos + " de 10 centavos, " + m5centavos +
        " de 5 centavos e " + m1centavo + " de 1 centavo.");
  }
}
