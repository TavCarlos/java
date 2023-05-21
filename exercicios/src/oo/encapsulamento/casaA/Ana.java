package oo.encapsulamento.casaA;

public class Ana {
	
/*Encapsulamento tem níveis:
	
	private = Somente a própria classe pode acessar, ou seja, ana;
	default = Somente classes que estão no mesmo pacote podem acessar, ou seja, ana e paulo;
	protected = somente classes que estão no mesmo pacote e/ou por herança, ou seja, ana, paulo e pedro;
	public = todas as outras classes podem acessar.
*/
	
	@SuppressWarnings("unused")
	private String segredo = "...";
	String facoDentroDeCasa = "...";
	protected String formaDeFalar = "...";
	public String todosSabem = "...";
}
