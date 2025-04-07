import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);
      scanner.useLocale(Locale.US);

      System.out.println("What is your name?");
      String name = scanner.nextLine();

      System.out.println("What is your last name?");
      String lastName = scanner.nextLine();

      System.out.println("How old are you?");
      int age = scanner.nextInt();

      System.out.println("What is your height?");
      double height = scanner.nextDouble();

      System.out.println("What is your weight?");
      double weight = scanner.nextDouble();

      System.out.println("Hi " + name + " " + lastName + "!");
      System.out.println("You are " + age + " years old.");
      System.out.println("Your height is " + height + "m and your weight is " +
                         weight + "kg.");
    } catch (InputMismatchException e) {
      System.out.println("Invalid input. Please try again.");
    }
  }
}
