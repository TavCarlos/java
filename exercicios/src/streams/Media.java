package streams;

public class Media {

	private double total;
	private int quantidade;
	
	public Media adicionar(double valor) { //ao invés de retornar 'void' posso retornar a própria instância atual => 'media'
		total += valor;
		quantidade++; //a cada valor adicionado, ele adiciona 1 na quantidade para saber quantos valores tem
		return this; //vai retornar própria média, com isso posso encadear o método na instância
	}
	
	
	public double getValor() {
		return this.total / this.quantidade;
	}
	
	public static Media combinar(Media m1, Media m2) { //Media da média;
		Media resultante = new Media();
		resultante.quantidade = m1.quantidade + m2.quantidade;
		resultante.total = m1.total + m2.total;
		return resultante;
	}
	
}