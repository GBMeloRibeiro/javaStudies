import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite uma frase: ");
    String frase = sc.nextLine();

    String[] palavras = frase.toLowerCase().split("\\s+");

    Map<String, Integer> contagem = new HashMap<>();

    for (String p : palavras) {
      if (p.isEmpty())
        continue;
      if (contagem.containsKey(p)) {
        contagem.put(p, contagem.get(p) + 1);
      } else {
        contagem.put(p, 1);
      }
    }

    for (String palavra : contagem.keySet()) {
      System.out.println(palavra + ": " + contagem.get(palavra));
    }

    sc.close();
  }
}
