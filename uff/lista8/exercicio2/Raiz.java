public class Raiz extends OperacaoMatematica {

  public Raiz(double operando1) { super(operando1, 0); }

  @Override
  public double calcular() throws Exception {
    if (operando1 < 0) {
      throw new Exception("Não é possível tirar raiz de número negativo!");
    }
    return Math.sqrt(operando1);
  }
}
