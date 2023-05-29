package TratamentoExcecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	
	//exceção não verificada ou não checada - liberdade que você tem de tratar ou não o erro
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!"); 
	}
	
	//exceção checada
	static void geraErro2() throws Exception{ //precisa expecificar que esse método lança um erro.
		throw new Exception("Ocorreu um erro bem legal #02!"); //não consigo compilar o código por ser uma exceção checada
		//me obrigado a trata-lá.
	}
}
