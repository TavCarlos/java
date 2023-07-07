package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {
		
		Assento assento = new Assento("9D");
		Cliente cliente = new Cliente("Maria", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirTransacao()
			.incluir(assento)
			.incluir(cliente)
			.fecharTransacao()
			.fechar();
	}
}

/*
 *O DAO é um Object pois há duas classes que precisam utilizar o DAO, sendo object o mais amplo, que abrange todos.
 *Mas é possível ter um dao para cada classe. 
 *
 * É importante a ordem de qual vai classe vai ser persistida primeiro, pois no exemplo, a classe cliente precisa da classe assento
 * Logo, a classe assento deve persistida primeiro.
 * 
 * Porém, como as duas classes estão no mesmo sistema transacional, a ordem não importaria muito.
 * Mas se fossem em dao's diferente, ocorreria um Exceção.
 * */
