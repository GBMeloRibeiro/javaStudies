import java.util.Date;

public class Main {
  static class Livro {
    String titulo;
    String autor;

    Livro(String titulo, String autor) {
      this.titulo = titulo;
      this.autor = autor;
    }
  }

  static class Pessoa {
    String nome;

    Pessoa(String nome) { this.nome = nome; }
  }

  static class Emprestimo {
    Livro livro;
    Pessoa pessoa;
    Date data;

    Emprestimo(Livro livro, Pessoa pessoa) {
      this.livro = livro;
      this.pessoa = pessoa;
      this.data = new Date();
    }
  }

  public static void main(String[] args) {
    Livro l1 = new Livro("O Senhor dos Anéis", "Tolkien");
    Pessoa p1 = new Pessoa("Gabriel");

    Emprestimo e = new Emprestimo(l1, p1);

    System.out.println("Empréstimo:");
    System.out.println("Livro: " + e.livro.titulo + " - " + e.livro.autor);
    System.out.println("Pessoa: " + e.pessoa.nome);
    System.out.println("Data: " + e.data);
  }
}
