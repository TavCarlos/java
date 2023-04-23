package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		//CAST
		
		int c = 4;
		byte d = (byte) c; // c é um valor 'int'. Colocando (byte) irá converter explicitamente para byte.
		//Como int tem maior capacidade de armazenamento, pode haver perda de informação ao passar para byte.
		System.out.println(d);
		
		
		//convertendo double para int
		double e = 1.5;
		int f = (int) e;
		System.out.println(f);
		
		
		
		
	}
}
