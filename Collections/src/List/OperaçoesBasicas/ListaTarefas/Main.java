package List.OperaçoesBasicas.ListaTarefas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O numero total de tarefas: "+ listaTarefa.obterTotalTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de tarefas: "+ listaTarefa.obterTotalTarefas());
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de tarefas: "+ listaTarefa.obterTotalTarefas());
        listaTarefa.obterDescricaoTarefa();
    }
}