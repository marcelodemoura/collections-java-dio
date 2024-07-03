package list.operacoesBasicas;

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

    public void removeTarefa(String descricao) {
        List<Tarefa> tarefasRemove = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemove.add(tarefa);

            }
        }
        tarefaList.removeAll(tarefasRemove);
    }

    public int obterTotalTarefa(){
        return tarefaList.size();
    }
    public void obterDescricaoTarfas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("Numero Total de elementos na lista é: = " + listaTarefa.obterTotalTarefa());

        listaTarefa.removeTarefa("Tarefa 3");
        System.out.println("Numero Total de elementos na lista é: = " + listaTarefa.obterTotalTarefa());

        listaTarefa.obterDescricaoTarfas();
    }
}
