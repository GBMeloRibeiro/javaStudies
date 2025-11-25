public class Gerente extends Funcionario {
  public Gerente(String nome, String senha) { super(nome, senha); }

  public void fecharCaixa() { System.out.println("Caixa fechado"); }

  public void gerarRelatorio() { System.out.println("Relatório gerado"); }
}
