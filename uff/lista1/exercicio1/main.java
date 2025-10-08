public class main {
  public static void main(String[] args) {
    System.out.print("Digite seu nome: ");
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    String nome = scanner.nextLine();
    System.out.println("Olá, " + nome + "! Bem-vindo ao Java.");
    scanner.close();
  }
}
