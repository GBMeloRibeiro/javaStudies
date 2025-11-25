public class Estagiario extends Funcionario {
  public Estagiario(String nome, float salarioBruto) {
    super(nome, salarioBruto);
  }

  public float salarioLiquido() { return salarioBruto; }
}
