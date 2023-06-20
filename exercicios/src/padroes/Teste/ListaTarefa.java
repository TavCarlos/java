package padroes.Teste;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa { //subject -> responsável por observar o evento

	
	List<Tarefa> tarefas = new ArrayList<>();
	List<Observable> observadores = new ArrayList<>();
	
	public void registerObservable(Observable observador) {
		observadores.add(observador);
	}
	
	public void NotifyObservables(TarefaAcao evento) {
		observadores.stream().forEach(observable -> observable.update(evento));
	}
	
	
	public void adicionarTarefa(String tarefa) {
		tarefas.add(new Tarefa(tarefa));
		NotifyObservables(TarefaAcao.ADICIONAR);
	}
	
	public void removeTarefa(String tarefa) {
		tarefas.remove(new Tarefa(tarefa));
		NotifyObservables(TarefaAcao.REMOVER);
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}
	

}
