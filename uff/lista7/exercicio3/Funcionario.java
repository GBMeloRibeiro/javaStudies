public class Funcionario {
  protected String nome;
  protected float salarioBruto;

  public Funcionario(String nome, float salarioBruto) {
    this.nome = nome;
    this.salarioBruto = salarioBruto;
  }

  protected float calcularIR(float base) {
    if (base <= 900)
      return 0;
    if (base <= 1500)
      return base * 0.15f;
    return base * 0.20f;
  }

  public float salarioLiquido() {
    float ir = calcularIR(salarioBruto);
    return salarioBruto - ir;
  }
}
