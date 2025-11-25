import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String texto;
    int i, contadorA = 0;

    System.out.print("Digite uma palavra ou frase: ");
    texto = scanner.nextLine();

    System.out.println("Total de caracteres: " + texto.length());
    System.out.println("Maiúsculo: " + texto.toUpperCase());
    System.out.println("Minúsculo: " + texto.toLowerCase());

    for (i = 0; i < texto.length(); i++) {
      if (Character.toUpperCase(texto.charAt(i)) == 'A') {
        contadorA++;
      }
    }

    System.out.println("Quantidade de letras A: " + contadorA);
  }
}
