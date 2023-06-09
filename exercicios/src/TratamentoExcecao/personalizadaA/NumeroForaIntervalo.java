package TratamentoExcecao.personalizadaA;

//Exeções não checadas ou não verificadas -> não exigem que sejam tratadas explicitamente, embora possam ser tratadas se necessário.
@SuppressWarnings("serial")
public class NumeroForaIntervalo extends RuntimeException {

	
	private String nomeDoAtributo;
	
		public NumeroForaIntervalo(String nomeDoAtributo) {
			this.nomeDoAtributo = nomeDoAtributo;
		}
		
		public String getMessage() {
			return String.format("O atributo '%s' está fora do intervalo.", nomeDoAtributo);
		}
}
