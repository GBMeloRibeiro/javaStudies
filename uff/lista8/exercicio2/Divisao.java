public class Divisao extends OperacaoMatematica {

  public Divisao(double operando1, double operando2) {
    super(operando1, operando2);
  }

  @Override
  public double calcular() throws Exception {
    if (operando2 == 0) {
      throw new Exception("Divisão por zero não é permitida!");
    }
    return operando1 / operando2;
  }
}
