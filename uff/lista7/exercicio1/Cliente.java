public class Cliente extends Usuario {
  private String endereco;
  private String telefone;

  public Cliente(String nome, String senha, String endereco, String telefone) {
    super(nome, senha);
    this.endereco = endereco;
    this.telefone = telefone;
  }

  public String getEndereco() { return endereco; }

  public String getTelefone() { return telefone; }
}
