package livros;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
  private List<Livro> livrosList;

  public Catalogo() {
    this.livrosList = new ArrayList<>();
  }
  
  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    livrosList.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> listPorAutor = new ArrayList<>();

    if (!livrosList.isEmpty()) {
      for (Livro livro : livrosList) {
        if (livro.getAutor().equalsIgnoreCase(autor)) {
          listPorAutor.add(livro);
        }
      }
    }
    return listPorAutor;
  }

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicio, int anoFim) {
    List<Livro> listPorIntervaloAnos = new ArrayList<>();

    if (!livrosList.isEmpty()) {
      for (Livro livro : livrosList) {
        if (livro.getAnoPublicacao() >= anoInicio && livro.getAnoPublicacao() <= anoFim) {
          listPorIntervaloAnos.add(livro);
        }
      }
    }
    return listPorIntervaloAnos;
  }

  public Livro pesquisarPorTitulo(String titulo) {
    Livro livroPorTitulo = null;

    if (!livrosList.isEmpty()) {
      for (Livro livro : livrosList) {
        if (livro.getTitulo().equalsIgnoreCase(titulo)) {
          livroPorTitulo = livro;
          break;
        }
      }
    }
    return livroPorTitulo;
  }

  public static void main(String[] args) {
    Catalogo catalogo = new Catalogo();
    catalogo.adicionarLivro("Dom Casmurro", "Machado de Assis", 1899);
    catalogo.adicionarLivro("O Alienista", "Sophia de Mello Breyner Andresen", 1962);
    catalogo.adicionarLivro("A Metamorfose", "Franz Kafka", 1915);
    catalogo.adicionarLivro("Allien", "Sophia de Mello Breyner Andresen", 1962);
    catalogo.adicionarLivro("Alice no País das Maravilhas", "Lewis Carroll", 1865);
    catalogo.adicionarLivro("O Príncipe", "Maquiavel", 1532);

    System.out.println("Pesquisa por autor:");
    System.out.println(catalogo.pesquisarPorAutor("Maquiavel"));


    System.out.println("Pesquisa por intervalo de anos:");
    System.out.println(catalogo.pesquisarPorIntervaloAnos(1850, 2000));

    System.out.println("Pesquisa por título:");
    System.out.println(catalogo.pesquisarPorTitulo("O Alienista")); 

  }

}
