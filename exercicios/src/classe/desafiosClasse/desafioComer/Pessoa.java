package classe.desafiosClasse.desafioComer;

public class Pessoa {

	String nome;
	double pesoInicial;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.pesoInicial = peso;
		this.peso = peso;
	}
	
	double Comer(Comida comida) { //primeiro 'Comida' -> qual classe o objeto representa
		//segundo 'comida' -> pode ser qualquer nome.
		return peso += comida.PesoComida;
	}
	
	double Engordou(){
		return  peso - pesoInicial;
	}
	
	double Academia() {
		return peso - 0.5;
	}
	
	
}
