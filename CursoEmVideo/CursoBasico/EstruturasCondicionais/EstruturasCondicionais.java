import java.util.Scanner;

/**
 * EstruturasCondicionais
 */
public class EstruturasCondicionais {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite as notas do aluno: ");
    float nota1 = teclado.nextFloat();
    float nota2 = teclado.nextFloat();
    float media = (nota1 + nota2) / 2;
    System.out.println("Sua media foi: " + media);
    if (media >= 6) {
      System.out.println("Parabens");
    }
  }

}
