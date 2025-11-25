public class StatusCalculator {

  public static String verificarStatus(double media) {

    if (media > 6) {
      return "Aprovado";
    } else if (media >= 4 && media <= 6) {
      return "Verificação Suplementar";
    } else {
      return "Reprovado";
    }
  }
}
