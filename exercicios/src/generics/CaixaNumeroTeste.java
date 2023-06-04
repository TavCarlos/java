package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		//CaixaNumero<String> caixaA = new CaixaNumero<>(); //não conseguindo gerar uma instância com outro tipo além de número
		
		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		caixaB.setCoisa(3);
		
		System.out.println(caixaB.getCoisa());
		
		
		
		CaixaNumero<Double> caixaC = new CaixaNumero<>();
		caixaC.setCoisa(3.1415);
		System.out.println(caixaC.getCoisa());
	}
}
