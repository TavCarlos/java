package classe.desafiosClasse;

public class Data { //Classe Data

	/*
	 * Dentro do corpo de uma classe pode haver Atributos(dados) e Comportamentos(metodos -igual o main);
	 */
	
	
	//Atributos da classe data
	int dia;
	int mes;
	int ano;

	
	//construtores
	Data(){
		dia = 1; //caso o usuário não informe os valores, esse será o valor padrão.
		mes = 1;
		ano = 1970;
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
		
	}
	
	
	//tipo retorno string do método obterDataFormatada
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
	
	//outra forma de fazer:
	String dataformatar() {
		return String.format("%d/%d/%d", dia, mes, ano); //irá formatar as variável na string especificada.
	}
	 
	
	
}
