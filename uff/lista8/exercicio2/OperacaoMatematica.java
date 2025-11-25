public abstract class OperacaoMatematica {

  protected double operando1;
  protected double operando2;

  public OperacaoMatematica(double operando1, double operando2) {
    this.operando1 = operando1;
    this.operando2 = operando2;
  }

  public abstract double calcular() throws Exception;

  public void executar() {
    try {
      double resultado = calcular();
      System.out.println("Resultado: " + resultado);
    } catch (Exception e) {
      System.out.println("Erro ao executar operação: " + e.getMessage());
    }
  }
}
