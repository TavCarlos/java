package classe.desafiosClasse;

public class DataTeste {

	public static void main(String[] args) {
		//instanciando duas datas.
		
		Data d1 = new Data(20 ,1, 1998); //criei a isntância d1
//		d1.dia = 20;
//		d1.mes = 1;
//		d1.ano = 1998;
		
		Data d2 = new Data(); //criei a instância d2 - outro espaço de memória pois é instância diferente.
		d2.dia = 3;
		d2.mes = 9;
		d2.ano = 2020;
		
		System.out.println(d1.dataformatar());
		System.out.println(d2.obterDataFormatada());
		//Diferentemente de uma função o método precisa estar instaciado para poder utilizar.
		
	}
}
