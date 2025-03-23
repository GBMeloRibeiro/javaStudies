import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    //TODO: Conhecer e importar a classe Scanner
      //Exibir as mensagens para o nosso usuario
      //obter pela scanner os valores digitados no terminal
      //exibir a mensagem conta criada

    Scanner teclado = new Scanner(System.in);
    int numero = 1021;
    String agencia = "067-8";
    String nome = "GABRIEL MELO RIBEIRO";
    double saldo = 237.48;
    System.out.println("Por favor, digite o numero da agencia!");
    int agenciaDigitada = teclado.nextInt();
    if (agenciaDigitada==numero) {
      System.out.println("Ola "+nome+"! Sua conta foi criada com sucesso! Obrigado por criar uma conta em nosso banco, sua agencia e: "+agencia+", Conta "+numero+" e seu saldo de R$"+saldo+" ja esta disponivel para saque!");
    } else {
      System.out.println("Numero da agencia invalido! Por favor, tente novamente.");
    }
  }
}

