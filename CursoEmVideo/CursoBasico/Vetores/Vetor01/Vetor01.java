public class Vetor01 {

  public static void main(String[] args) {
    int n[] = { 3, 2, 8, 7, 5, 4 };
    // int[] n = new int[6];
    System.out.println("O tamanho do vetor e de " + n.length + " casas");
    System.out.print("Vetor:");
    for (int i = 0; i < n.length; i++) {
      System.out.print(" " + n[i]);
    }
    System.out.print("\n");
  }
}
