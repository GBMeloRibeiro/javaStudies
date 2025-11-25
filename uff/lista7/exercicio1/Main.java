public class Main {
  public static void main(String[] args) {
    Cliente c = new Cliente("Ana", "123", "Rua A", "9999-9999");
    Funcionario f = new Funcionario("Bruno", "abc");
    Gerente g = new Gerente("Carlos", "xyz");

    f.registrarVenda();
    g.registrarVenda();
    g.fecharCaixa();
    System.out.println(c.getNome());
  }
}
