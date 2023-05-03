package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		/*Como o Atributo 'pi' pertence ao objeto, é possível alterar esse valor a qualquer momento.
		  Podendo haver 2 instância com valores de 'pi' distintas, como no exemplo abaixo */
		AreaCirc calculoCircunferencia = new AreaCirc(10.0); //instanciando
		calculoCircunferencia.pi = 10; //colocando o pi para valore 10
		System.out.println(calculoCircunferencia.area());
		
		AreaCirc calculoCirc2 = new AreaCirc(5.0);
		calculoCirc2.pi = 5;
		System.out.println(calculoCirc2.area());
		
		System.out.println();//espaço
		//------------------------------------------///------------------------------///--------------------------------
		AreaCirc calculoCirc3 = new AreaCirc(5.0);
//		calculoCirc3.PI = 850; 
		
		AreaCirc calculoCirc4 = new AreaCirc(5.0);
//		calculoCirc4.PI = 5;
		
//		AreaCirc.PI = 3.1415; -> Caso realmente queira mudar o valor de PI em todas as instâncias
		System.out.println(calculoCirc3.area2());
		System.out.println(calculoCirc4.area2());
		
	/*Quando é alterado um atributo que pertence a uma classe (static)
	 ele não irá mudar somente para aquela instância, ele muderá para todos.*/	
		
		
	}
}
