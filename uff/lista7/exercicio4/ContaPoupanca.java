public class ContaPoupanca extends Conta {
  public ContaPoupanca(int numero, float saldo) { super(numero, saldo); }

  public void render(float percentual) { saldo += saldo * percentual; }
}
