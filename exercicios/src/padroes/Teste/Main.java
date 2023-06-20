package padroes.Teste;

public class Main {

	public static void main(String[] args) {
		ListaTarefa listaTarefas = new ListaTarefa();
		
		Usuario usuario = new Usuario("Carlos");
		
		listaTarefas.registerObservable(usuario);
		listaTarefas.adicionarTarefa("Lavar louça");
		listaTarefas.adicionarTarefa("Comer bolo");
		
		listaTarefas.removeTarefa("Lavar louça");
		
		
	}
}
