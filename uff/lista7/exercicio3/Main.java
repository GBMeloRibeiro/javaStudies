public class Main {
  public static void main(String[] args) {
    Funcionario f = new Funcionario("Carlos", 1200);
    Estagiario e = new Estagiario("Ana", 1000);
    Vendedor v = new Vendedor("João", 1500, 0.10f);

    System.out.println(f.salarioLiquido());
    System.out.println(e.salarioLiquido());
    System.out.println(v.salarioLiquido());
  }
}
