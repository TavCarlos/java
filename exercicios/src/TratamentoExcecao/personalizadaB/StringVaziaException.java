package TratamentoExcecao.personalizadaB;

//EXCEÇÃO CHECADA - herda diretamente de exception, ou seja, deve ser tratada diretamente pelos códidos que a chama.
@SuppressWarnings("serial")
public class StringVaziaException extends Exception{

	private String nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está vazio", nomeDoAtributo);
	}
}
