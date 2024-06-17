package List.OperaçoesBasicas.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // Atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> paraRemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                paraRemover.add(t);
            }
        }
        tarefaList.removeAll(paraRemover);
    }
    public int obterTotalTarefas(){
        return tarefaList.size();
    }
    public void obterDescricaoTarefa(){
        System.out.println(tarefaList);

    }
}
