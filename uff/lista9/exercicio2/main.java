import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite uma frase: ");
    String frase = sc.nextLine();

    String[] palavras = frase.toLowerCase().split("\\s+");

    Set<String> conjunto = new HashSet<>();

    for (String p : palavras) {
      if (!p.isEmpty())
        conjunto.add(p);
    }

    System.out.println("Número de palavras não repetidas: " + conjunto.size());

    sc.close();
  }
}
