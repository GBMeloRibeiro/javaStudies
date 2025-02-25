public class Vetor02 {
  public static void main(String[] args) {
    String[] mes = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
        "Outubro", "Novembro", "Dezembro" };
    int[] dia = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    for (int i = 0; i < mes.length; i++) {
      if (dia[i] == 28) {
        System.out
            .println("O mes de " + mes[i] + " tem " + dia[i] + " dias, exceto em anos bissextos, que tem 29 dias.");
      }
      System.out.println("O mes de " + mes[i] + " tem " + dia[i] + " dias.");
    }
  }
}
