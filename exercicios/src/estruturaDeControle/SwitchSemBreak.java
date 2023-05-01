package estruturaDeControle;

public class SwitchSemBreak { //raramente é usado sem o Break

	public static void main(String[] args) {
		
		/*
		 * Como não tem a palavra 'BREAK' ele vai executar todos os que estão em baixo dele.
		 * Logo, se eu tenho a faixa ''laranja'' ele irá executar a lanraja e todos que estão abaixo dela.
		 * */
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) { //pode receber qualquer valor, não somente um boolean
		
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
//		default:
//				System.out.println("Não sei de nada");
		}
		
	}
}
