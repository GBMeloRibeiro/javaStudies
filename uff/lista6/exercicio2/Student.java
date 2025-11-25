public class Student {

  private double n1;
  private double n2;
  private double n3;

  public Student(double n1, double n2, double n3) {
    this.n1 = n1;
    this.n2 = n2;
    this.n3 = n3;
  }

  // Critério de média do curso (exemplo mais comum: média aritmética)
  public double calcularMedia() { return (n1 + n2 + n3) / 3.0; }
}
