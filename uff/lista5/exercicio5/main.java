public class Main {
  static class Data {
    int dia, mes, ano;

    Data(int dia, int mes, int ano) {
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
    }

    boolean dataValida() {
      if (ano < 1 || mes < 1 || mes > 12 || dia < 1)
        return false;
      int[] diasMes = {
          31, anoBissextoAno(ano) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,
          31};
      return dia <= diasMes[mes - 1];
    }

    boolean anoBissexto() { return dataValida() && anoBissextoAno(ano); }

    boolean anoBissextoAno(int a) {
      return (a % 400 == 0) || (a % 4 == 0 && a % 100 != 0);
    }

    void imprime() { System.out.println(dia + "/" + mes + "/" + ano); }

    void imprime(String sep) {
      System.out.println(dia + sep + mes + sep + ano);
    }
  }

  public static void main(String[] args) {
    Data d1 = new Data(29, 2, 2024);
    System.out.println("Data válida: " + d1.dataValida());
    System.out.println("Ano bissexto: " + d1.anoBissexto());
    d1.imprime();
    d1.imprime("-");
  }
}
