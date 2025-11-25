import java.lang.Math;
import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("informe 3 pontos no plano (x,y)");
    int[] ponto1 = new int[2];
    int[] ponto2 = new int[2];
    int[] ponto3 = new int[2];
    System.out.println("Digite as coordenadas do ponto 1");
    System.out.print("Abississa (x): ");
    ponto1[0] = scanner.nextInt();
    System.out.print("Ordenada (y): ");
    ponto1[1] = scanner.nextInt();
    System.out.println("Digite as coordenadas do ponto 2");
    System.out.print("Abississa (x): ");
    ponto2[0] = scanner.nextInt();
    System.out.print("Ordenada (y): ");
    ponto2[1] = scanner.nextInt();
    System.out.println("Digite as coordenadas do ponto 3");
    System.out.print("Abississa (x): ");
    ponto3[0] = scanner.nextInt();
    System.out.print("Ordenada (y): ");
    ponto3[1] = scanner.nextInt();
    double distancia12 = Math.sqrt(Math.pow(ponto2[0] - ponto1[0], 2) +
                                   Math.pow(ponto2[1] - ponto1[1], 2));
    double distancia13 = Math.sqrt(Math.pow(ponto3[0] - ponto1[0], 2) +
                                   Math.pow(ponto3[1] - ponto1[1], 2));
    double distancia23 = Math.sqrt(Math.pow(ponto3[0] - ponto2[0], 2) +
                                   Math.pow(ponto3[1] - ponto2[1], 2));
    if (distancia12 + distancia13 > distancia23 &&
        distancia12 + distancia23 > distancia13 &&
        distancia13 + distancia23 > distancia12) {
      System.out.println("Os pontos formam um triângulo.");
      if (distancia12 == distancia13 && distancia12 == distancia23) {
        System.out.println("O triângulo é equilátero.");
      } else if (distancia12 == distancia13 || distancia12 == distancia23 ||
                 distancia13 == distancia23) {
        System.out.println("O triângulo é isósceles.");
      } else {
        System.out.println("O triângulo é escaleno.");
      }
    } else {
      System.out.println("Os pontos não formam um triângulo.");
    }
  }
}
