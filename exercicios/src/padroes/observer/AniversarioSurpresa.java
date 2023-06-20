package padroes.observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.registrarObservadores(namorada); //adiciona namorada na lista de observadores
		porteiro.registrarObservadores(e -> System.out.println("Surpresa via lambda"));
		porteiro.monitorar();
		
		
	}
}
