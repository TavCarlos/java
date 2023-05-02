package desafios.desafiosClasse;

public class DataTeste {

	public static void main(String[] args) {
		//instanciando duas datas.
		
		Data d1 = new Data(); //criei a isntância d1
		d1.dia = 20;
		d1.mes = 1;
		d1.ano = 1998;
		
		Data d2 = new Data(); //criei a instância d2 - outro espaço de memória pois é instância diferente.
		d2.dia = 3;
		d2.mes = 9;
		d2.ano = 2020;
		
		System.out.printf("Primeira data: %d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		System.out.printf("Segunda data: %d/%d/%d", d2.dia, d2.mes, d2.ano);
	}
}
