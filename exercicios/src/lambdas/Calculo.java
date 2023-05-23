package lambdas;

@FunctionalInterface //validation que especifica que essa interface será utilizada em contexto de lambda
//além de forçar a interface a ter somente um método.
public interface Calculo {

	public double executar(double a, double b);
	
	default String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "Muito Legal";
	}
}


 //Dentro de uma interface funcional eu só preciso ter uma função abstrata, podendo haver métodos estáticos e métodos default;
 