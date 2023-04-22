package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//A principal diferença dos tipos primitivos é a capacidade de armazenameto deles (bytes)
		//com isso, cada tipo primitivo tem um 'range' de valor que é possível guardar.
		
		//informações de um funcionário
		
		//tipos numéricos inteiros
		byte anosDeEmpresa = 23; //Capacidade: 1 byte - Range: -128 a 127
		short numeroDeVoos = 542;//Capacidade: 2 bytes - Range: -32.768 a 32.767
		int id = 56789; //Capacidade: 4 bytes - Range: -2Bilhões a 2Bilhões
		long pontosAcumulados = 3_234_845_220L;//Capacidade 8 bytes - Range (-9Quintilhões a 9Quintolhões)
		//OBS: É preciso utilizar a letra 'L' no final da variável para que seja reconhecido como long.
		
		
		//Tipos numéricos flutuante (Reais)
		float salario = 11_445.44F; //Capacidade: 4Bytes. Por padrão o JAVA compreende números reais como double
		//por isso é necessário utilizar a letra 'F'
		double vendasAcumuladas = 2_991_797_103.01; //Capacidade 8Bytes.
		
		//Tipo Booleano;
		boolean estaDeFerias = false; //true or false
		
		//Tipo charactere
		char status = 'A'; //só aceita uma única letra
		
		
		System.out.println(anosDeEmpresa * 365);
		System.out.println(numeroDeVoos/2);
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + " Ganha -> "+ salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
