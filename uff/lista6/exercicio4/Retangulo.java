public class Retangulo {
  private int x;
  private int y;
  private int largura;
  private int altura;

  public Retangulo(int x, int y, int largura, int altura) {
    this.x = x;
    this.y = y;
    this.largura = largura;
    this.altura = altura;
  }

  public int getX() { return x; }

  public int getY() { return y; }

  public int getLargura() { return largura; }

  public int getAltura() { return altura; }

  public void setX(int x) { this.x = x; }

  public void setY(int y) { this.y = y; }

  public void setLargura(int largura) { this.largura = largura; }

  public void setAltura(int altura) { this.altura = altura; }

  public int area() { return largura * altura; }

  public int perimetro() { return 2 * (largura + altura); }

  public void mover(int novoX, int novoY) {
    x = novoX;
    y = novoY;
  }

  public void redimensionar(int novaLargura, int novaAltura) {
    largura = novaLargura;
    altura = novaAltura;
  }
}
