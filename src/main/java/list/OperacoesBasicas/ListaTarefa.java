package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarNaLista(String item){
        tarefaList.add(new Tarefa(item));
    }

    public void removerNaLista(String item){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t:tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(item) ){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterTamanhoList(){
        return tarefaList.size();
    }

    public void obterdescricaoTarefas(){
        System.out.println(tarefaList);
    }
}
