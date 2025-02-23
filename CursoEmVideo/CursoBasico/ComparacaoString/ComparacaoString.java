public class ComparacaoString {
  public static void main(String[] args) {
    String n1 = "Gabriel";
    String n2 = "Gabriel";
    String n3 = new String("Gabriel");
    String res;
    res = (n1.equals(n3)) ? "igual" : "diferente";
    System.out.println(res);
  }
}
