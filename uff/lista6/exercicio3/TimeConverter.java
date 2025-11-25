public class TimeConverter {

  public static int getHoras(int totalSegundos) { return totalSegundos / 3600; }

  public static int getMinutos(int totalSegundos) {
    return (totalSegundos % 3600) / 60;
  }

  public static int getSegundos(int totalSegundos) {
    return totalSegundos % 60;
  }
}
