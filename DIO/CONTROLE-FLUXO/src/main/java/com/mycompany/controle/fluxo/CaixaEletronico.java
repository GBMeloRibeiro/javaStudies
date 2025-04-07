package com.mycompany.controle.fluxo;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class CaixaEletronico {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double saldo = 100.0;
    System.out.println("Digite o valor do saque: ");
    double saque = teclado.nextDouble();
    if (saque > saldo) {
      System.out.println("Saldo insuficiente");
    } else {
      saldo -= saque;
      System.out.println("Saque efetuado com sucesso");
      System.out.println("Saldo atual: " + saldo);
    }
  }
}
