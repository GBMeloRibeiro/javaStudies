import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite uma frase: ");
    String frase = sc.nextLine();

    // Quebra a frase em palavras
    String[] palavras = frase.split(" ");

    // Coloca as palavras em uma lista
    List<String> lista = Arrays.asList(palavras);

    // Inverte a lista
    Collections.reverse(lista);

    // Junta novamente em uma string
    String fraseInvertida = String.join(" ", lista);

    System.out.println("Frase invertida: " + fraseInvertida);

    sc.close();
  }
}
