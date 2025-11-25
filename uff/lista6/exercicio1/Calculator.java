import java.util.Scanner;

public class Calculator {

  private Memory memory;
  private Scanner input;

  public Calculator() {
    memory = new Memory();
    input = new Scanner(System.in);
  }

  public void start() {
    int option;

    do {
      System.out.println("\nEstado da memória: " + memory.getValue());
      System.out.println("(1) Somar");
      System.out.println("(2) Subtrair");
      System.out.println("(3) Multiplicar");
      System.out.println("(4) Dividir");
      System.out.println("(5) Limpar memória");
      System.out.println("(6) Sair do programa");
      System.out.print("Qual opção você deseja? ");

      option = input.nextInt();

      handleOption(option);

    } while (option != 6);
  }

  private void handleOption(int option) {
    if (option >= 1 && option <= 4) {
      System.out.print("Digite o número: ");
      double n = input.nextDouble();

      switch (option) {
      case 1:
        memory.add(n);
        break;
      case 2:
        memory.subtract(n);
        break;
      case 3:
        memory.multiply(n);
        break;
      case 4:
        memory.divide(n);
        break;
      }

    } else if (option == 5) {
      memory.clear();
    } else if (option == 6) {
      System.out.println("Encerrando...");
    } else {
      System.out.println("Opção inválida.");
    }
  }
}
