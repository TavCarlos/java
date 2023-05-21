package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Carlos", 30);
	//	p1.idade = 30;
		p1.setIdade(250);
	
		System.out.println(p1);
	}
}
