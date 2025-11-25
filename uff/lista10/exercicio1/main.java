import java.util.Scanner;

public class Main {

  public static boolean primo(int x) {
    if (x < 2)
      return false;
    for (int i = 2; i * i <= x; i++) {
      if (x % i == 0)
        return false;
    }
    return true;
  }

  static class ContadorPrimos extends Thread {
    int inicio;
    int fim;
    int resultado;

    ContadorPrimos(int inicio, int fim) {
      this.inicio = inicio;
      this.fim = fim;
    }

    public void run() {
      for (int i = inicio; i <= fim; i++) {
        if (primo(i))
          resultado++;
      }
    }

    public int getResultado() { return resultado; }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor de n: ");
    int n = scanner.nextInt();

    int meio = n / 2;

    ContadorPrimos t1 = new ContadorPrimos(0, meio);
    ContadorPrimos t2 = new ContadorPrimos(meio + 1, n);

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      System.out.println("Erro na thread");
    }

    int total = t1.getResultado() + t2.getResultado();

    System.out.println("Quantidade de números primos entre 0 e " + n + ": " +
                       total);

    scanner.close();
  }
}
