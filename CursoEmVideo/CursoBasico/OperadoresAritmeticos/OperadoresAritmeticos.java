public class OperadoresAritmeticos {
  public static void main(String[] args) {
    int n1 = 3;
    int n2 = 5;
    float m = (n1 + n2) / 2;
    System.out.println("A média é igual a " + m);
    float elevacao = (float) Math.pow(5, 2);
    System.out.println(elevacao);
    double ale = Math.random();
    int n = (int) (5 + ale * (10 - 5));
    System.out.println(n);
  }
}
