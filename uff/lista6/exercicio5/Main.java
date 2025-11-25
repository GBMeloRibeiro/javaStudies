import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int x, y, raio;
    System.out.print("Digite x: ");
    x = scanner.nextInt();
    System.out.print("Digite y: ");
    y = scanner.nextInt();
    System.out.print("Digite o raio: ");
    raio = scanner.nextInt();

    Circulo c = new Circulo(x, y, raio);

    System.out.println("Área: " + c.area());
    System.out.println("Perímetro: " + c.perimetro());

    System.out.print("Novo x: ");
    c.setX(scanner.nextInt());
    System.out.print("Novo y: ");
    c.setY(scanner.nextInt());
    System.out.print("Novo raio: ");
    c.setRaio(scanner.nextInt());

    System.out.println("Área após alteração: " + c.area());
    System.out.println("Perímetro após alteração: " + c.perimetro());
  }
}
