public class Funcionario extends Usuario {
  public Funcionario(String nome, String senha) { super(nome, senha); }

  public void registrarVenda() { System.out.println("Venda registrada"); }

  public void aplicarDesconto() { System.out.println("Desconto aplicado"); }
}
