public class Main {
  static class ContaCorrente {
    double saldo;

    ContaCorrente(double saldoInicial) { this.saldo = saldoInicial; }

    void depositar(double valor) { saldo += valor; }

    boolean sacar(double valor) {
      double total = valor + 1.5;
      if (saldo >= total) {
        saldo -= total;
        return true;
      }
      return false;
    }

    double getSaldo() { return saldo; }
  }

  public static void main(String[] args) {
    ContaCorrente c = new ContaCorrente(100);

    c.depositar(50);
    System.out.println("Saldo: " + c.getSaldo());

    if (c.sacar(30))
      System.out.println("Saque realizado");
    else
      System.out.println("Saldo insuficiente");

    System.out.println("Saldo: " + c.getSaldo());

    if (c.sacar(200))
      System.out.println("Saque realizado");
    else
      System.out.println("Saldo insuficiente");

    System.out.println("Saldo final: " + c.getSaldo());
  }
}
