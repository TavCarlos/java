package lambdas.desafiosLambda;


import java.util.function.Function;
import java.util.function.UnaryOperator;

import lambdas.Produto;

public class CalculoProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Ipad", 3235.89, 0.13);
		
		Function<Produto, Double> discountPrice = prod -> prod.preco * (1 - prod.desconto);
		UnaryOperator<Double> tax = price ->  price >= 2500 ? price * 1.085 : price;
		UnaryOperator<Double> shipping = price -> price >= 3000? price + 100.0 : price + 50.0;
		Function<Double, String> decimalFormatter = price -> String.format("%.2f", price);
		//UnaryOperator<Double> decimalFormatter = price -> Double.parseDouble(String.format("%.2f", price)); OUTRA MANEIRA
		UnaryOperator<String> finalFormatter = price -> "R$".concat(price).replace(".", ",");
		
		
		String finalPrice = discountPrice.andThen(tax).andThen(shipping).andThen(decimalFormatter)
				.andThen(finalFormatter).apply(produto);
		
		System.out.println("Preço final é: "+ finalPrice);
 	}
}
