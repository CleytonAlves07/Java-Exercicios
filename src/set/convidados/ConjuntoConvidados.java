package set.convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

  private Set<Convidado> convidados;

  public ConjuntoConvidados() {
    this.convidados = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoConvite) {
    convidados.add(new Convidado(nome, codigoConvite));
  }

  public void removerConvidadoPorCodigoConvite(int codigoConvite) {
    convidados.removeIf(convidado -> convidado.getCodigoConvite() == codigoConvite);
  }

  public int contarConvidados() {
    return convidados.size();
  }
  
  public Set<Convidado> exibirConvidados() {
    return convidados;
  }

  public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");
    conjuntoConvidados.adicionarConvidado("Jão do caminhão", 1234);
    conjuntoConvidados.adicionarConvidado("Zé", 1235);
    conjuntoConvidados.adicionarConvidado("Maria", 1236);
    conjuntoConvidados.adicionarConvidado("Marcos", 1237);
    conjuntoConvidados.adicionarConvidado("Marcos", 1237);
    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");
    conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");
    System.out.println("Os convidados são: " + conjuntoConvidados.exibirConvidados());
  }
}
