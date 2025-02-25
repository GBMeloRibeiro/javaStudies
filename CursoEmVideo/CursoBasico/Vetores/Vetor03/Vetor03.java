import java.util.Arrays;

public class Vetor03 {
  public static void main(String[] args) {
    int[] n = { 3, 2, 8, 7, 5, 4 };
    Arrays.sort(n);
    int pos = Arrays.binarySearch(n, 5);
    System.out.println("Encontrei o valor 5 na posição " + pos);
    for (int valor : n) {
      System.out.print(" " + valor);
    }
    System.out.print("\n");
  }
}
