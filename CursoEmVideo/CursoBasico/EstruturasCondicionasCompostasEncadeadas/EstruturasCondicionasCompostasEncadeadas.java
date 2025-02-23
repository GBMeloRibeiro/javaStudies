import java.util.Scanner;

public class EstruturasCondicionasCompostasEncadeadas {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite o seu ano de nascimento: ");
    int anoNascimento = teclado.nextInt();
    int idade = 2025 - anoNascimento;
    if (idade < 16) {
      System.out.println("Voce nao pode votar");
    } else {
      if (idade < 18 || idade > 70) {
        System.out.println("voce pode votar, porem nao e obrigatorio");
      } else {
        System.out.println("voce e obrigado a votar");
      }
    }
  }
}
