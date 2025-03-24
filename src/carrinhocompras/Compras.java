package carrinhocompras;

public class Compras {
  
  private String descricao;
  private double preco;
  private int quantidade;

  public Compras(String descricao, double preco, int quantidade) {
    this.descricao = descricao;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public String getDescricao() {
    return descricao;
  }
    
  @Override
    public String toString() {
      return "Compras{" +
        "descricao='" + descricao + '\'' +
        ", preco=" + preco +
        ", quantidade=" + quantidade +
        '}';
    }

  public double getPreco() {
    return preco;
  }
  
  public int getQuantidade() {
    return quantidade;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  
  public void setPreco(double preco) {
    this.preco = preco;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

}
