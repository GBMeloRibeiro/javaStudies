import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Animal[] animais = new Animal[10];
    Random r = new Random();

    for (int i = 0; i < animais.length; i++) {
      int tipo = r.nextInt(3);
      if (tipo == 0)
        animais[i] = new Homem();
      else if (tipo == 1)
        animais[i] = new Cao();
      else
        animais[i] = new Gato();
    }

    for (int i = 0; i < animais.length; i++) {
      System.out.println(animais[i].fala());
    }
  }
}
