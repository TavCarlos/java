package classe.desafiosClasse;

public class Product {

	//Atributos
	String name;
	double price;
	static double discount = 0.25;
	
	//Construtor
	Product(String inicialName, double inicialPrice){
		name = inicialName;
		price = inicialPrice;
	}
	
	//método
	double priceDiscount() {
		return price * (1 - discount);
	}
}
