package padroes.Teste;

public class Usuario implements Observable { //observer -> pois está interessado em ser notificado quando evento acontecer

	private String nome;
	
	Usuario(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	

	@Override
	public void update(TarefaAcao evento) {
		if(evento == TarefaAcao.ADICIONAR) {
			System.out.println("Item adicionado com sucesso!");
		} else {
			System.out.println("Item removido com sucesso!");
		}
	}

}
