import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int x, y, largura, altura;
    System.out.print("Digite x: ");
    x = scanner.nextInt();
    System.out.print("Digite y: ");
    y = scanner.nextInt();
    System.out.print("Digite a largura: ");
    largura = scanner.nextInt();
    System.out.print("Digite a altura: ");
    altura = scanner.nextInt();

    Retangulo r = new Retangulo(x, y, largura, altura);

    System.out.println("Área: " + r.area());
    System.out.println("Perímetro: " + r.perimetro());

    System.out.print("Novo x: ");
    r.setX(scanner.nextInt());
    System.out.print("Novo y: ");
    r.setY(scanner.nextInt());
    System.out.print("Nova largura: ");
    r.setLargura(scanner.nextInt());
    System.out.print("Nova altura: ");
    r.setAltura(scanner.nextInt());

    System.out.println("Área após alteração: " + r.area());
    System.out.println("Perímetro após alteração: " + r.perimetro());
  }
}
