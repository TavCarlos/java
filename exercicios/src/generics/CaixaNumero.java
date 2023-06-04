package generics;

public class CaixaNumero<T extends Number> extends Caixa<T>{

	//T extends Number -> você cria uma restrição para o tipo generics
	//Number -> é a classe pai do Interger,Double, float e outras classes que representam números
	//Sendo assim, o tipo generics 'T' só irá aceitar números
	
}
