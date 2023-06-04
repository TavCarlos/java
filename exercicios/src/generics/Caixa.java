package generics;

public class Caixa<G> { //crio uma tipo genérico que nomeei "GENERICO"
							//porém o tipo do "GENERICO" ainda não está definido.
	
	private G coisa;
	
	
	void setCoisa(G coisa) {
		this.coisa = coisa;
	}
	
	G getCoisa() {
		return coisa;
	}
	
}
