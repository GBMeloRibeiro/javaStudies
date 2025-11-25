public class Main {
  public static void main(String[] args) {
    ContaComum c1 = new ContaComum(1, 500);
    ContaPoupanca c2 = new ContaPoupanca(2, 1000);
    ContaEspecial c3 = new ContaEspecial(3, 300, 500);

    c1.sacar(100);
    c2.render(0.05f);
    c3.sacar(700);

    System.out.println(c1.getSaldo());
    System.out.println(c2.getSaldo());
    System.out.println(c3.getSaldo());
  }
}
