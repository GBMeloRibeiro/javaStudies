import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("informe a distancia percorrida (em KM): ");
    float distancia = scanner.nextInt();
    System.out.println("informe o tempo gasto (em horas): ");
    float tempo = scanner.nextInt();
    System.out.println(
        "informe a quantidade de gasolina consumida (em litros): ");
    float gasolinaConsumida = scanner.nextInt();
    float velocidadeMedia = distancia / tempo;
    System.out.println("velocidade media de: " + velocidadeMedia + " km/h");
    float consumoMedio = distancia / gasolinaConsumida;
    System.out.println("consumo medio de: " + consumoMedio + " km/l");
  }
}
