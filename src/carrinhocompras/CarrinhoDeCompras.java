package carrinhocompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  
  private List<Compras> comprasList;

  public CarrinhoDeCompras() {
    this.comprasList = new ArrayList<>();
  }

  public void adicionarCompra(String descricao, double preco, int quantidade) {
    comprasList.add(new Compras(descricao, preco, quantidade));
  }

  public void removerCompra(String descricao) {
    List<Compras> comprasParaRemover = new ArrayList<>();

    for (Compras compra : comprasList) {
      if (compra.getDescricao().equalsIgnoreCase(descricao)) {
        comprasParaRemover.add(compra);
      }
    }
    comprasList.removeAll(comprasParaRemover);
  }

  public int calcularValorTotal() {
    int valorTotal = 0;
    for (Compras compra : comprasList) {
      valorTotal += compra.getPreco() * compra.getQuantidade();
    }
    return valorTotal;
  }

  public void exibirItens() {
    System.out.println(comprasList);
  }

  public void limparCarrinho() {
    comprasList.clear();
  }

  public static void main(String[] args) {
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
    carrinho.adicionarCompra("Arroz", 10.0, 2);
    carrinho.adicionarCompra("Feijão", 8.0, 1);
    carrinho.adicionarCompra("Macarrão", 5.0, 3);
    carrinho.exibirItens();
    System.out.println("Valor total: " + carrinho.calcularValorTotal());
    carrinho.removerCompra("Feijão");
    carrinho.exibirItens();
    System.out.println("Valor total: " + carrinho.calcularValorTotal());
    carrinho.limparCarrinho();
    carrinho.exibirItens();
    System.out.println("Valor total: " + carrinho.calcularValorTotal());
  }
}
