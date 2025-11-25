public class ContaEspecial extends Conta {
  private float limite;

  public ContaEspecial(int numero, float saldo, float limite) {
    super(numero, saldo);
    this.limite = limite;
  }

  public boolean sacar(float valor) {
    if (valor <= saldo + limite) {
      saldo -= valor;
      return true;
    }
    return false;
  }
}
