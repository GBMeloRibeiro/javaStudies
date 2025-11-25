import java.util.ArrayList;

public class Main {
  static class Contato {
    String nome;
    String telefone;

    Contato(String nome, String telefone) {
      this.nome = nome;
      this.telefone = telefone;
    }
  }

  static class Agenda {
    ArrayList<Contato> contatos = new ArrayList<>();

    void adicionar(Contato c) { contatos.add(c); }

    void listar() {
      for (Contato c : contatos) {
        System.out.println(c.nome + " - " + c.telefone);
      }
    }

    Contato buscar(String nome) {
      for (Contato c : contatos) {
        if (c.nome.equalsIgnoreCase(nome))
          return c;
      }
      return null;
    }
  }

  public static void main(String[] args) {
    Agenda agenda = new Agenda();

    agenda.adicionar(new Contato("João", "9999-1111"));
    agenda.adicionar(new Contato("Maria", "9888-2222"));
    agenda.adicionar(new Contato("Carlos", "9777-3333"));

    System.out.println("Contatos:");
    agenda.listar();

    System.out.println("\nBusca:");
    Contato c = agenda.buscar("Maria");
    if (c != null)
      System.out.println(c.nome + " - " + c.telefone);
    else
      System.out.println("Contato não encontrado");
  }
}
