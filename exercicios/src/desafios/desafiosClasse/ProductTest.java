package desafios.desafiosClasse;

public class ProductTest {

	public static void main(String[] args) {
		
		Product product1 = new Product("Laptop", 3750.25);
		Product product2 = new Product("Mouse", 57.35);
		Product product3 = new Product("Screen 35\"", 1854.99);
		
		
		System.out.printf("Nome: %s\nPreço: R$%.2f\nPreço com Desconto: R$%.2f",product1.name, product1.price, product1.priceDiscount());
		System.out.println();
		System.out.printf("\nNome: %s\nPreço: R$%.2f\nPreço com Desconto: R$%.2f",product2.name, product2.price, product2.priceDiscount());
		System.out.println();
		System.out.printf("\nNome: %s\nPreço: R$%.2f\nPreço com Desconto: R$%.2f",product3.name, product3.price, product3.priceDiscount());
		
	}
}
