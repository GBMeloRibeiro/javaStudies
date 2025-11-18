public class Main {
    // Exception class
    public static class CepInvalidoException extends Exception {
        public CepInvalidoException() {
            super("CEP inválido");
        }
    }

    // Main method
  public static void main(String[] args) {
    Number valor = Double.valueOF("a1.75");
    System.out.println(valor);
    String teste = 87564903;
         epublic static String
         formatarCep(String cep) throws CepInvalidoException {
      if cep == null || cep.length() != 8){
            throw new CepInvalidoException();
        }
      else {
        return cep.substring(0, 5) + "-" + cep.substring(5, 8);
      }
    }
        formatarCep(String cep) throws CepInvalidoException {
      if cep == null || cep.length() != 8){
            throw new CepInvalidoException();
        }
      else {
        return cep.substring(0, 5) + "-" + cep.substring(5, 8);
      }
    }
  }
}
