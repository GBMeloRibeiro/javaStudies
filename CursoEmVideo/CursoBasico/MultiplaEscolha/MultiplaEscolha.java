import java.util.Scanner;

public class MultiplaEscolha {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Quantas pernas voce tem? ");
    int pernas = teclado.nextInt();
    String tipo;
    switch (pernas) {
      case 1:
        System.out.println("Voce e o Saci!");
        tipo = "Lenda";
        break;
      case 2:
        System.out.println("Voce e um Bipede!");
        tipo = "Humano";
        break;
      case 4:
        System.out.println("Voce e um Quadrupede!");
        tipo = "Animal";
        break;
      case 6, 8:
        System.out.println("Voce e um Aracnideo!");
        tipo = "Aranha";
        break;
      default:
        System.out.println("Voce e um ET!");
        tipo = "Extraterrestre";
    }
    System.out.println("tu e " + tipo);
  }
}
