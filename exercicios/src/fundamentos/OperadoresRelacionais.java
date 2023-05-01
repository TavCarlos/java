package fundamentos;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		//resultado será boolean
		
		System.out.println(3 == 7); //igual
		System.out.println(30 != 7); //diferente
		System.out.println(3 > 4); //maior que
		System.out.println(3 >= 3); //maior ou igual que
		System.out.println(3 < 7); //menor que
		System.out.println(30 <= 7); //menor ou igual que 
		
		double media = 7.3;
		boolean BomComportamento = true;
		boolean PassouPorMedia = media >= 7;
		boolean TemDesconto = BomComportamento && PassouPorMedia;
		
		System.out.printf("Tem desconto? %b", TemDesconto);
	}
}
