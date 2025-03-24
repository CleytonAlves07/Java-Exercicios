package listadetarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

  private List<Tarefa> tarefaList;

  public ListaTarefa() {
    this.tarefaList = new ArrayList<>();
  }

  public void adicionarTarefa(String descricao) {
    tarefaList.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    List<Tarefa> tarefasParaRemover = new ArrayList<>();

    for (Tarefa tarefa : tarefaList) {
      if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
        tarefasParaRemover.add(tarefa);
      }
    }
    tarefaList.removeAll(tarefasParaRemover);
  }
  
  public int obterQuantidadeTotalTarefas() {
    return tarefaList.size(); 
  }

  public void obterDescricoesTarefas() {
    System.out.println(tarefaList);
  }

  public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();

    System.out.println("O número total de tarefas é : " + listaTarefa.obterQuantidadeTotalTarefas());
    listaTarefa.adicionarTarefa("Estudar Java");
    listaTarefa.adicionarTarefa("Estudar Java");
    listaTarefa.adicionarTarefa("Estudar Angular");
    System.out.println("O número total de tarefas é : " + listaTarefa.obterQuantidadeTotalTarefas());
    listaTarefa.obterDescricoesTarefas();
    listaTarefa.removerTarefa("Estudar Java");
    System.out.println("O número total de tarefas é : " + listaTarefa.obterQuantidadeTotalTarefas());
    listaTarefa.obterDescricoesTarefas();
  }
}
