package set.contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  private Set<Contato> contatos;

  public AgendaContatos() {
    this.contatos = new HashSet<>();
  }

  public void adicionarContato(String nome, int numero) {
    contatos.add(new Contato(nome, numero));
  }

  public Set<Contato> exibirContatos() {
    return contatos;
  }

  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> contatosPorNome = new HashSet<>();

    for (Contato contato : contatos) {
      if (contato.getNome().startsWith(nome)) {
        contatosPorNome.add(contato); 
      }
    }
    return contatosPorNome; 
  }

  public Contato atualizarNumeroContato(String nome, int numero) {
    for (Contato contato : contatos) {
      if (contato.getNome().equals(nome)) {
        contatos.remove(contato);
        contatos.add(new Contato(nome, numero));
        return contato;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.adicionarContato("Jão do caminhão", 1234);
    agendaContatos.adicionarContato("Zé", 1235);
    agendaContatos.adicionarContato("Maria", 1236);
    agendaContatos.adicionarContato("Marcos", 1237);
    agendaContatos.adicionarContato("Marcos", 1237);

    System.out.println("Os contatos são: " + agendaContatos.exibirContatos());
    System.out.println("Os contatos que começam com a letra 'M' são: " + agendaContatos.pesquisarPorNome("M"));
    System.out.println("O contato atualizado foi: " + agendaContatos.atualizarNumeroContato("Marcos", 1238));
    System.out.println("Os contatos são: " + agendaContatos.exibirContatos());
  }
}