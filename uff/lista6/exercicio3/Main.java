public class Main {

  public static void main(String[] args) {

    int totalSegundos = IO.lerSegundos();

    int horas = TimeConverter.getHoras(totalSegundos);
    int minutos = TimeConverter.getMinutos(totalSegundos);
    int segundos = TimeConverter.getSegundos(totalSegundos);

    IO.imprimirResultado(horas, minutos, segundos);
  }
}
