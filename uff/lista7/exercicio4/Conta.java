public class Conta {
  protected int numero;
  protected float saldo;

  public Conta(int numero, float saldo) {
    this.numero = numero;
    this.saldo = saldo;
  }

  public void depositar(float valor) { saldo += valor; }

  public boolean sacar(float valor) {
    if (valor <= saldo) {
      saldo -= valor;
      return true;
    }
    return false;
  }

  public float getSaldo() { return saldo; }
}
