public class Circulo {
  private int x;
  private int y;
  private int raio;

  public Circulo(int x, int y, int raio) {
    this.x = x;
    this.y = y;
    this.raio = raio;
  }

  public int getX() { return x; }

  public int getY() { return y; }

  public int getRaio() { return raio; }

  public void setX(int x) { this.x = x; }

  public void setY(int y) { this.y = y; }

  public void setRaio(int raio) { this.raio = raio; }

  public double area() { return Math.PI * raio * raio; }

  public double perimetro() { return 2 * Math.PI * raio; }

  public void mover(int novoX, int novoY) {
    x = novoX;
    y = novoY;
  }

  public void redimensionar(int novoRaio) { raio = novoRaio; }
}
