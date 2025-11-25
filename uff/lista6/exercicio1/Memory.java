public class Memory {
  private double value;

  public Memory() { this.value = 0.0; }

  public double getValue() { return value; }

  public void add(double n) { value += n; }

  public void subtract(double n) { value -= n; }

  public void multiply(double n) { value *= n; }

  public void divide(double n) {
    if (n == 0) {
      System.out.println("Erro: divisão por zero!");
      return;
    }
    value /= n;
  }

  public void clear() { value = 0.0; }
}
