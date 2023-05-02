package desafios.desafiosClasse;

public class Data { //Classe Data

	/*
	 * Dentro do corpo de uma classe pode haver Atributos(dados) e Comportamentos(metodos -igual o main);
	 */
	
	
	//Atributos da classe data
	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada() {
		String stringDia = Integer.toString(dia);
		String stringMes = Integer.toString(mes);
		String stringAno = Integer.toString(ano);
		
		String anoFormatado = stringDia+"/"+stringMes+"/"+stringAno;
		
		return anoFormatado;
	}
	
	//outra forma de fazer:
	String dataFormatada() {
		return dia+"/"+mes+"/"+ano;
	}
}
