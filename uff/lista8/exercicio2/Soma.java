public class Soma extends OperacaoMatematica {

  public Soma(double operando1, double operando2) {
    super(operando1, operando2);
  }

  @Override
  public double calcular() {
    return operando1 + operando2;
  }
}
