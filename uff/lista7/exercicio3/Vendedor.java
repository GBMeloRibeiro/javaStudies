public class Vendedor extends Funcionario {
  private float bonusPercentual;

  public Vendedor(String nome, float salarioBruto, float bonusPercentual) {
    super(nome, salarioBruto);
    this.bonusPercentual = bonusPercentual;
  }

  public float salarioLiquido() {
    float total = salarioBruto + salarioBruto * bonusPercentual;
    float ir = calcularIR(total);
    return total - ir;
  }
}
